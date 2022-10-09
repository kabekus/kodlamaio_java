package week3.oopWithNLayeredApp.business;

import week3.oopWithNLayeredApp.core.logging.Logger;
import week3.oopWithNLayeredApp.dataAccess.ProductDao;
import week3.oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {

        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz!");
        }

        //ProductDao productDao = new JdbcProductDao();
        productDao.add(product);

        for(Logger logger : loggers){ //[db,mail,file]
            logger.log(product.getName());
        }
    }
}
