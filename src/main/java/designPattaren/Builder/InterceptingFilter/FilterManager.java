package designPattaren.Builder.InterceptingFilter;

import designPattaren.Builder.InterceptingFilter.Filter.AuthenticationFilter;
import designPattaren.Builder.InterceptingFilter.Filter.DebugFilter;
import designPattaren.Builder.InterceptingFilter.Target.MyTarget;

public class FilterManager {
    FilterChain filterChain1;

    public FilterManager(MyTarget target1) {
        this.filterChain1 = new FilterChain();
//        filterChain1.setChain(myFilter1);
        filterChain1.setTarget(target1);
    }
    public void setFileter(IMyFilter myFilter1){
        filterChain1.addChain(myFilter1);
    }
    public void filterRequest(String request){
        filterChain1.execute(request);
    }

//    public void setFileter(DebugFilter debugFilter) {
//    }
}
