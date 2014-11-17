package org.javaee7.concurrency.managedthreadfactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Arun Gupta
 */
@WebServlet(urlPatterns = {"/TestJNDIServlet"})
public class TestJNDIServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestJNDIServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Getting ManagedThreadFactory using JNDI lookup</h1>");
            try {
                InitialContext ctx = new InitialContext();
                
                ManagedThreadFactory factory = (ManagedThreadFactory) ctx.lookup("java:comp/DefaultManagedThreadFactory");
//                ManagedExecutorService executor = (ManagedExecutorService) ctx.lookup("concurrent/myExecutor");
                out.println("Getting ManageableThread<br>");
                Thread thread = factory.newThread(new MyTask(2));
                out.println("Starting thread<br>");
                thread.start();
                out.println("Thread started<br><br>");
            } catch (NamingException ex) {
                Logger.getLogger(TestResourceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.println("all tasks submitted<br/><br/>");
            out.println("Check server.log for output from the task.");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
