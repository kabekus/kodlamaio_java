package week3.oopWithNLayeredApp.dataAccess;

import week3.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        System.out.println(product.getName()+" JDBC ile veritabanına eklendi ");
    }
}
