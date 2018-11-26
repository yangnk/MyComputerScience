package designPattaren.builder.frontController;

public class Dispatcher {
    private HomeView homeView1;
    private StudentView studentView1;

    public Dispatcher() {
        this.homeView1 = new HomeView();
        this.studentView1 = new StudentView();
    }

    public void dispatch(String request){
        if (request.equalsIgnoreCase("homeview")) {
            homeView1.show();
        }
        if (request.equalsIgnoreCase("studentview")) {
            homeView1.show();
        }
    }
}
