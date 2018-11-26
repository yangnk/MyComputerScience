package designPattaren.builder.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder1 = new ApplePCBuilder();
        Director director1 = new Director(builder1);
        director1.construct(4,8,"Window7");
        System.out.println(builder1.create().toString());
    }
}
