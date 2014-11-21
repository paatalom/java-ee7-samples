package cu.edu.java.ee7.validation.methods;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;

@WebServlet(urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {

    @Inject
    MyBean bean;

    @Inject
    MyBean2 bean2;

    @Inject
    Validator validator;

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
        try (final PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bean Validation : Methods Validation</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bean Validation : Methods Validation</h1>");

            String type = request.getParameter("type");
            try {
                if (type.equals("1")) {
                    String name = request.getParameter("name");
                    bean.sayHello(name);
                    out.println(name + " validated successfully.");
                } else if (type.equals("2")) {
                    String date = request.getParameter("date");
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    bean.showDate(format.parse(date));
                    out.print(date + " validated successfully.");
                } else if (type.equals("3")) {
                    List<String> list = new ArrayList<>();
                    Integer list_size = Integer.parseInt(request.getParameter("list_size"));
                    for (int i = 0; i < list_size; i++) {
                        list.add("Name" + i);
                    }
                    String result = bean.showList(list, "Item-");
                    out.println("List Validation Result : " + result);
                } else if (type.equals("4")) {
                    MyParameter param = bean2.getValue();
                    out.println("Value : " + param.getValue());
                } else if (type.equals("5")) {
                    MyParameter parameter = new MyParameter();
                    String name = request.getParameter("name");
                    if (name != null && !name.trim().equals("")) {
                        parameter.setValue(name);
                    }
                    ExecutableValidator methodValidator = validator.forExecutables();
                    Constructor<MyBean2> constructor = MyBean2.class
                            .getConstructor(parameter.getClass());

                    Set<ConstraintViolation<MyBean2>> constraints = methodValidator
                            .validateConstructorParameters(constructor, new Object[]{parameter});

                    boolean isEmpty = constraints.isEmpty();
                    out.println("Empty : " + isEmpty);
                }

            } catch (Exception e) {
                out.println(e.toString());
            }
            out.println("</body>");
            out.println("</html>");
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
