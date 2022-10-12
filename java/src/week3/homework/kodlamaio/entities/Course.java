package week3.homework.kodlamaio.entities;

public class Course {
    private int id;
    private String courseName, courseTrainer;
    private double price;

    public Course(int id ,String courseName, String courseTrainer, double price) {
        this.id = id;
        this.courseName = courseName;
        this.courseTrainer = courseTrainer;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTrainer() {
        return courseTrainer;
    }

    public void setCourseTrainer(String courseTrainer) {
        this.courseTrainer = courseTrainer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
