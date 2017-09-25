package designPattaren.Builder.InterceptingFilter.Filter;

import designPattaren.Builder.InterceptingFilter.IMyFilter;

public class DebugFilter implements IMyFilter{
    public void execute(String request) {
        System.out.println("DebugFilter request: " + request);
    }
}
