public class Product extends ListProductsDao { //our model
    private String name; //fields (informed by the entity)
    private double price; //fields

    public Product (){}; //empty constructor
    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }; //filled in constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };

    public double getPrice() {
        return price;
    };

    public void setPrice(double price) {
        this.price = price;
    };
}
