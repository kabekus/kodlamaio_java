package week3.homework.kodlamaio.dataAccess.hibernate;

import week3.homework.kodlamaio.dataAccess.CourseDao;
import week3.homework.kodlamaio.entities.Course;

public class HibernateCourseDAO implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+" Hibernate ile veritabanına eklendi");
    }
}
