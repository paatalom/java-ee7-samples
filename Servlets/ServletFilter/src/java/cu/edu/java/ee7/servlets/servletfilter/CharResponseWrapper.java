package cu.edu.java.ee7.servlets.servletfilter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
import java.io.PrintWriter;

public class CharResponseWrapper extends HttpServletResponseWrapper {
    
    private final CharArrayWriter output;

    @Override
    public String toString() {
        return output.toString();
    }

    public CharResponseWrapper(HttpServletResponse response) {
        super(response);
        output = new CharArrayWriter();
    }

    @Override
    public PrintWriter getWriter() {
        return new PrintWriter(output);
    }
}
