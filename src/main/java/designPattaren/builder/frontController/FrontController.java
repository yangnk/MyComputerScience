package designPattaren.builder.frontController;

public class FrontController {
    private Dispatcher dispatcher1;

    public FrontController() {
        this.dispatcher1 = new Dispatcher();
    }
    public boolean isAuthenticUser(){
        //isAuthenticUser 逻辑
        return true;
    }
    public void trackRequest(String request){
        System.out.println("page request...");

    }
    public void dispatchRequest(String request){
        trackRequest(request);
        if (isAuthenticUser()){
            dispatcher1.dispatch(request);
        }
    }
}
