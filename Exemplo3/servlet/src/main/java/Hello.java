import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MinhaServlet", urlPatterns = { "/oi", "/ola" })
public class Hello extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            out.println("<html>");
            out.println("<head><title> Java Home Page </title></head>");
            out.println("<body style='text-align: center'>");
            out.println("<h1> Hello darknes my old friend! </h1>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}