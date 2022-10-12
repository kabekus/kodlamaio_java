package week3.homework.kodlamaio.dataAccess.hibernate;

import week3.homework.kodlamaio.dataAccess.CategoryDAO;
import week3.homework.kodlamaio.entities.Category;

public class HibernateCategoryDAO implements CategoryDAO {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+" Hibernate ile veritabanına eklendi");
    }
}
