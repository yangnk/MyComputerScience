package designPattaren.MVC.InterceptingFilter.Filter;

import designPattaren.MVC.InterceptingFilter.IMyFilter;

public class DebugFilter implements IMyFilter{
    public void execute(String request) {
        System.out.println("DebugFilter request: " + request);
    }
}
