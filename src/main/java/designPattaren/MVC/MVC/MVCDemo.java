package designPattaren.MVC.MVC;

public class MVCDemo {
    public static void main(String[] args) {
        Student model = new Student(1,"yang");
        Student model1 = new Student(2,"ning");
        Student model2 = new Student(3,"kai");

//        model.setId(1);
//        model.setName("yang");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        StudentController controller1 = new StudentController(model1, view);
        StudentController controller2 = new StudentController(model2, view);
        controller.updateStudentView();
        controller1.updateStudentView();
        controller2.updateStudentView();
    }
}
