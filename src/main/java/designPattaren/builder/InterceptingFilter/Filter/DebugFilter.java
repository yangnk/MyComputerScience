package designPattaren.builder.InterceptingFilter.Filter;

import designPattaren.builder.InterceptingFilter.IMyFilter;

public class DebugFilter implements IMyFilter{
    public void execute(String request) {
        System.out.println("DebugFilter request: " + request);
    }
}
