package cu.edu.java.ee7.servlets.servletfilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FooBarFilter", urlPatterns = {"/filtered/*"})
public class FooBarFilter implements Filter {

    private FilterConfig filterConfig;

    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        try (PrintWriter out = response.getWriter()) {
            out.print("before servlet request -- ");
            out.flush();
        }
    }

    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        try (PrintWriter out = response.getWriter()) {
            out.print(" -- after servlet request");
            out.flush();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        CharResponseWrapper wrappedResponse = new CharResponseWrapper(
                (HttpServletResponse)response);

        doBeforeProcessing(request, wrappedResponse);
        chain.doFilter(request, wrappedResponse);
        doAfterProcessing(request, wrappedResponse);

        out.write(wrappedResponse.toString());
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

}
