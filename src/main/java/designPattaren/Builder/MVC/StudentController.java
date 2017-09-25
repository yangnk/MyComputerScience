package designPattaren.Builder.MVC;

public class StudentController {
    private Student student1 = new Student();
    private StudentView studentView1 = new StudentView();

    public StudentController(Student student1, StudentView studentView1) {
        this.student1 = student1;
        this.studentView1 = studentView1;
    }

    public void updateStudentView(){
        studentView1.printStudentDetail(student1);
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }
}
