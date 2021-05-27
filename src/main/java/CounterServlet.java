import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {

    //page view counter
    private int counter = 0;


    //refer to Circles.java to see an example of using a counter. We extend HttpServlet so these files communicate with each other
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1;

        response.getWriter().println("Page refreshed " + counter + " times.");
    }

}