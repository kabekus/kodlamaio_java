package week3.homework.kodlamaio.business;

import week3.homework.kodlamaio.core.logging.Logger;
import week3.homework.kodlamaio.dataAccess.CourseDao;
import week3.homework.kodlamaio.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers,List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception{
        for (Course courseOrder : courses){
            if (courseOrder.getCourseName().equals(course.getCourseName())){
                throw new Exception("Kurs ismi aynı olamaz");
            }
        }
        if (course.getPrice() < 0)
            throw new Exception("Kurs ücreti 0'dan küçük olamaz");

        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
