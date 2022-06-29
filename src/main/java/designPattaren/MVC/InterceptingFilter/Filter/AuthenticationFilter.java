package designPattaren.MVC.InterceptingFilter.Filter;

import designPattaren.MVC.InterceptingFilter.IMyFilter;

public class AuthenticationFilter implements IMyFilter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
