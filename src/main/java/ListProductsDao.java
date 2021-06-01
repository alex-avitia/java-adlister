import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements Products {
    private List<Product> products = new ArrayList<>();

    public ListProductsDao(){
        insert(new Product("hammer", 9.99));
        insert(new Product("screwdriver", 9.99));
        insert(new Product("drill", 19.99));
    };

    @Override
    public List<Product> all(){
        return this.products;
    }

    @Override
    public void insert(Product product) {
        this.products.add(product);
    };
}
