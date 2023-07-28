package Question2;

import java.util.ArrayList;
//created a class Student
public class Student {
    //declared the class attributes
    String name;
    int grade;
    String course;
    private static ArrayList<Student>courses = new ArrayList<Student>();
    public Student(String name,int grade,String course){
        this.name=name;
        this.grade=grade;
        this.course = course;
    }
//applied getters and setters methods to allow access and updating of the attribute values
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static ArrayList<Student> getCourses() {
        return courses;
    }
    public static void addCourse(Student course){
        courses.add(course);
    }
    public static void removeCourse(Student course){
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mary",80,"Computer Hardware");
        Student student2 = new Student("Tracy",90,"Java");
        Student.getCourses();
        System.out.println(student1.getName());
        System.out.println(student1.getGrade());
        System.out.println(student1.getCourse());
    }
}

