package designPattern.MVC.DAO;

public class DAODemo {
    public static void main(String[] args) {
        StudentDAO studentDAO1 = new StudenDAOImpl();
        for (Student student1 : studentDAO1.getAllStudents()) {
            System.out.println("Student: [id : " + student1.getId() + ", Name : " + student1.getName() + " ]");
        }
        //upadate
        Student updatedStudent = new Student(3, "kai");
        studentDAO1.updateStudent(updatedStudent);
        for (Student student1 : studentDAO1.getAllStudents()) {
            System.out.println("Student: [id : " + student1.getId() + ", Name : " + student1.getName() + " ]");
        }
    }
}
