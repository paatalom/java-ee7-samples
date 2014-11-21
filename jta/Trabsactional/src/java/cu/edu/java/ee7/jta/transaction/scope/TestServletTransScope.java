package cu.edu.java.ee7.jta.transaction.scope;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

@WebServlet(urlPatterns = "/TestServletTransScope")
public class TestServletTransScope extends HttpServlet {

    @Inject
    MyTransactionalBean bean;
    
    @Inject
    MyTransactionalBean bean1;

    @Inject
    UserTransaction ut;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>JTA : Transactional</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>JTA : Transactional</h1>");

            bean.withTransaction();
            out.println("1. Equals:" + bean.id1.equals(bean.id2) + ",ID1: " + bean.id1 + ", ID2: " + bean.id2 + "</br>");

            bean.withTransaction();
            String firstId1 = bean.id1;

            bean.withTransaction();
            String secondId1 = bean.id1;
            out.println("2. Equals:" + firstId1.equals(secondId1) + ",ID1: " + firstId1 + ", ID2: " + secondId1 + "</br>");

            try {
                bean.withoutTransaction();
            } catch (Exception e) {
                out.println("3. " + e.toString() + "<br/>");
            }

            ut.begin();
            bean1.withTransaction();
            ut.commit();
            out.println("4. Equals:" + bean1.id1.equals(bean1.id2) + ",ID1: " + bean1.id1 + ", ID2: " + bean1.id2 + "</br>");
            
            ut.begin();
            bean1.withTransaction();
            String firstId11 = bean1.id1;

            bean1.withTransaction();
            String secondId11 = bean1.id1;
            ut.commit();

            out.println("5. Equals:" + firstId11.equals(secondId11) + ",ID1: " + firstId11 + ", ID2: " + secondId11 + "</br>");

            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
