import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowProductServlet", urlPatterns = "/products")
public class ShowProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Instantiates from the getProductsDao method
        Products productsDao = DaoFactory.getProductsDao();

        //gets all products
        List<Product> showProducts = productsDao.all();

        request.setAttribute("products", showProducts);
        request.getRequestDispatcher("/productIndex.jsp").forward(request, response);
    }
}
