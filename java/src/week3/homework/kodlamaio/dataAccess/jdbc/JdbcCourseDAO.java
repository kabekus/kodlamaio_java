package week3.homework.kodlamaio.dataAccess.jdbc;

import week3.homework.kodlamaio.dataAccess.CourseDao;
import week3.homework.kodlamaio.entities.Course;

public class JdbcCourseDAO implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+" JDBC ile veritabanına eklendi");
    }
}
