import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/count")
public class captcha extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>hello World</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        Integer openCounter = 0;
        resp.setContentType("text/html");

        try {
            Cookie c1[] = req.getCookies();
            openCounter = Integer.parseInt(c1[0].getValue());
        }catch (Exception e){
        }

        openCounter+=1;
        Cookie c = new Cookie("openCounter",openCounter.toString());
        c.setMaxAge(86400);


        resp.addCookie(c);
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);

        writer.println("Привет от сервлета! количество вызовов: " + openCounter +"  "+ new Date());

        writer.println(PAGE_FOOTER);
        writer.flush();
        writer.close();
    }

}
