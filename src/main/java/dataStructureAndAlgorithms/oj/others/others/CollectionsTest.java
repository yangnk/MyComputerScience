package dataStructureAndAlgorithms.oj.others.others;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-24 23:37
 **/
public class CollectionsTest {
    public static void main(String[] args) {
//        List<String> listS = new ArrayList<String>();
//        listS.add("5");
//        listS.add("2");
//        listS.add("9");
//        Collections.sort(listS);
//        System.out.println(listS);

        List<Employer1> list1 = new ArrayList<Employer1>();
        Employer1 a1 = new Employer1();
        Employer1 b1 = new Employer1();
        Employer1 c1 = new Employer1();
        a1.setName("a1");   a1.setAge(44);
        b1.setName("b1");   b1.setAge(55);
        c1.setName("b1");   c1.setAge(33);
        list1.add(a1);
        list1.add(b1);
        list1.add(c1);//Collections类的sort方法要求传入的第二个参数是一个已实现Comparator接口的比较器
        Collections.sort(list1, new Comparator<Employer1>() {
            @Override
            public int compare(Employer1 o1, Employer1 o2) {
                return  o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println(list1.toString());
    }

}

class Employer1{
    private String name;
    private Integer age;
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override//重载了Object类里的toString方法，使之可以按照我们要求的格式打印
    public String toString() {
        return "name is "+name+" age is "+ age;
    }
}
