package designPattaren.builder.InterceptingFilter.Filter;

import designPattaren.builder.InterceptingFilter.IMyFilter;

public class AuthenticationFilter implements IMyFilter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
