//package designPattern.MVC.InterceptingFilter;
//
//import designPattern.MVC.InterceptingFilter.Filter.AuthenticationFilter;
//import designPattern.MVC.InterceptingFilter.Filter.DebugFilter;
//
//public class InterceptingFilterDemo {
//    public static void main(String[] args) {
//        FilterManager filterManager = new FilterManager(new MyTarget());
//        filterManager.setFileter(new AuthenticationFilter());
//        filterManager.setFileter(new DebugFilter());
////        filterManager.setFileter(new DebugVC50SSOffsetMap16()ugFilter());ugFilter
//        Client client = new Client();
//        client.setFilterManager(filterManager);
//        client.sendRequest("home");
//
//    }
//
//}
