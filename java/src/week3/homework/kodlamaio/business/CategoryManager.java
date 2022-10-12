package week3.homework.kodlamaio.business;

import week3.homework.kodlamaio.core.logging.Logger;
import week3.homework.kodlamaio.dataAccess.CategoryDAO;
import week3.homework.kodlamaio.entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDAO categoryDAO;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDAO categoryDAO, Logger[] loggers, List<Category> categories) {
        this.categoryDAO = categoryDAO;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category categoryOrder : categories) {
            if (categoryOrder.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori ismi aynı olamaz.");
            }
        }

        categoryDAO.add(category);
        categories.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
