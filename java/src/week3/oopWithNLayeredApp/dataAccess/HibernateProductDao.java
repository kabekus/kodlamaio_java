package week3.oopWithNLayeredApp.dataAccess;

import week3.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        System.out.println(product.getName()+" Hibernate ile veritabanına eklendi !");
    }
}
