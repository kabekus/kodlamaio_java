package week3.oopWithNLayeredApp;

import week3.oopWithNLayeredApp.business.ProductManager;
import week3.oopWithNLayeredApp.core.logging.DatabaseLogger;
import week3.oopWithNLayeredApp.core.logging.FileLogger;
import week3.oopWithNLayeredApp.core.logging.Logger;
import week3.oopWithNLayeredApp.core.logging.MailLogger;
import week3.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import week3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import week3.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Huawei X",8500);
        Product product2 = new Product(2,"Huawei Y",7500);
        Logger[] loggers ={new DatabaseLogger(),new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);

        ProductManager productManager1 = new ProductManager(new HibernateProductDao(),loggers);
        productManager1.add(product2);
    }
}
