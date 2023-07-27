//package designPattern.MVC.InterceptingFilter;
//
//import designPattern.MVC.InterceptingFilter.Target.MyTarget;
//
//import java.util.ArrayList;
//
//public class FilterChain {
//    private ArrayList<IMyFilter> filterArrayList;
//    private MyTarget myTarget;
//
//    public FilterChain() {
//        this.filterArrayList = new ArrayList<IMyFilter>();
//    }
//
//    public void setTarget(MyTarget target1) {
//        this.myTarget = target1;
//    }
//
//    public void addChain(IMyFilter myFilter1) {
//        filterArrayList.add(myFilter1);
//    }
//
//    public void execute(String request) {
//        myTarget.execute(request);
//    }
//}
