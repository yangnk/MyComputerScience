package designPattern.MVC.DAO;

import java.util.ArrayList;
import java.util.List;

public class StudenDAOImpl implements StudentDAO {
    ArrayList<Student> students = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        Student student1 = new Student(1, "Robert");
        Student student2 = new Student(2, "John");
        students.add(student1);
        students.add(student2);
        return students;
//        return null;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void updateStudent(Student student) {
        students.add(student);
//        System.out.println();

    }

    public void deleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println("Student:  id " + student.getId() + ", deleted from database");
    }
}
