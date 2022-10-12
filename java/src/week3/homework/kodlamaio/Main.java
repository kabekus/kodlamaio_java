package week3.homework.kodlamaio;

import week3.homework.kodlamaio.business.CategoryManager;
import week3.homework.kodlamaio.business.CourseManager;
import week3.homework.kodlamaio.business.TrainerManager;
import week3.homework.kodlamaio.core.logging.DatabaseLogger;
import week3.homework.kodlamaio.core.logging.Logger;
import week3.homework.kodlamaio.dataAccess.hibernate.HibernateCategoryDAO;
import week3.homework.kodlamaio.dataAccess.hibernate.HibernateCourseDAO;
import week3.homework.kodlamaio.dataAccess.hibernate.HibernateTrainerDAO;
import week3.homework.kodlamaio.entities.Category;
import week3.homework.kodlamaio.entities.Course;
import week3.homework.kodlamaio.entities.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger()};

        Category category1 = new Category(1,"Yazılım");
        List<Category> categories = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDAO(),loggers,categories);
        categoryManager.add(category1);

        Course course1 = new Course(1,"Java 101","Engin Demiroğ",56);
        List<Course> courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new HibernateCourseDAO(),loggers,courses);
        courseManager.add(course1);

        Trainer trainer1 = new Trainer(1,"Engin Demiroğ");
        List<Trainer> trainers = new ArrayList<>();
        TrainerManager trainerManager = new TrainerManager(new HibernateTrainerDAO(),loggers,trainers);
        trainerManager.add(trainer1);
    }

}
