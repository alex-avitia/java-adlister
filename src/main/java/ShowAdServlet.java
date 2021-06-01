
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAdServlet", urlPatterns = "/ads")
public class ShowAdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //"Hey Servlet, go instantiate from that getProductsDao method I set up!" == get a DAO object
        Ads adsDao = DaoFactory.getAdsDao();
        //Let's get all the products

        List<Ad> showAds = adsDao.all();

        //Send all the products up to the JSP!
        request.setAttribute("ads", showAds);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);

    }



}