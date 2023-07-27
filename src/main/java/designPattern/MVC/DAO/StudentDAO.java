package designPattern.MVC.DAO;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();

    public Student getStudent(int id);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
