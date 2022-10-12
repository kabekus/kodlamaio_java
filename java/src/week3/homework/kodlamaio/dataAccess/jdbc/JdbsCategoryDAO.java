package week3.homework.kodlamaio.dataAccess.jdbc;

import week3.homework.kodlamaio.dataAccess.CategoryDAO;
import week3.homework.kodlamaio.entities.Category;

public class JdbsCategoryDAO implements CategoryDAO {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+" JDBC ile veritabanına eklendi");
    }
}
