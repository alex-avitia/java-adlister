import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int guess = Integer.parseInt(req.getParameter("guess"));
        int answer = (int) (Math.random() * 3) + 1;

        if (guess == answer) {
            res.sendRedirect("/correct");
        }

    }
}
