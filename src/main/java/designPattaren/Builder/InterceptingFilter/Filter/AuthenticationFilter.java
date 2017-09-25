package designPattaren.Builder.InterceptingFilter.Filter;

import designPattaren.Builder.InterceptingFilter.IMyFilter;

public class AuthenticationFilter implements IMyFilter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
