package designPattern.MVC.InterceptingFilter.Filter;

import designPattern.MVC.InterceptingFilter.IMyFilter;

public class DebugFilter implements IMyFilter {
    public void execute(String request) {
        System.out.println("DebugFilter request: " + request);
    }
}
