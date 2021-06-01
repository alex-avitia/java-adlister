public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProductsDao("products");
        }
        return productsDao;
    }
}
