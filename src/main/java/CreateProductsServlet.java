import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", urlPatterns = "/products/create")
public class CreateProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        Products productsDao = DaoFactory.getProductsDao();

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = new Product(name, price);

        productsDao
    }
}