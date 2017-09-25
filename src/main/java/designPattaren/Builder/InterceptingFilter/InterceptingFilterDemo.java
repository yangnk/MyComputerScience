package designPattaren.Builder.InterceptingFilter;

import designPattaren.Builder.InterceptingFilter.Filter.AuthenticationFilter;
import designPattaren.Builder.InterceptingFilter.Filter.DebugFilter;
import designPattaren.Builder.InterceptingFilter.Target.MyTarget;
import sun.jvm.hotspot.debugger.win32.coff.DebugVC50SSOffsetMap16;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new MyTarget());
        filterManager.setFileter(new AuthenticationFilter());
        filterManager.setFileter(new DebugFilter());
//        filterManager.setFileter(new DebugVC50SSOffsetMap16()ugFilter());ugFilter
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("home");

    }

}
