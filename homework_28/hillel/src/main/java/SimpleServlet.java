import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class SimpleServlet extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>hello World</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);

        writer.println("Привет от сервлета! " + new Date());

        writer.println(PAGE_FOOTER);
        writer.flush();
        writer.close();
    }

}