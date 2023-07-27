package algorithms.oj.others.ths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//问题一：
//        穷尽集合之间的元素组合。
//        input: list of list
//        [ [‘a’, ‘b’, ‘c’], [‘1’, ‘2’, ‘3’, ‘4’, ‘5’, ‘6’] , [‘A’, ‘B’, ‘C’, ‘D’] ]
//        output:
//        [
//        [‘a’, ‘1’, ‘A’],
//        [‘a’, ‘1’, ‘B’],
//        [‘a’, ‘1’, ‘C’],
//        [‘a’, ‘1’, ‘D’],
//        ...
//        [‘c’, ‘6’, ‘D’]
//        ]
//        实现下面的方法, 要求不要用递归的方法。


class CombinationProblem {
    public static ArrayList<ArrayList<String>> getSetCombination(ArrayList<ArrayList<String>> input) {
        //input为null或空则原样返回
        if (input == null || input.isEmpty()) {
            return input;
        }
        //input的元素个数为1时
        if (input.size() == 1) {
            ArrayList<String> arrayList = input.get(0);
            ArrayList<ArrayList<String>> result = new ArrayList();
            for (String item : arrayList) {
                result.add(new ArrayList(Arrays.asList(item)));
            }
            return result;
        }
        //input元素个数大于1时
        ArrayList<ArrayList<String>> result = new ArrayList();
        ArrayList<String> first = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            ArrayList<String> arrayList = input.get(i);
            if (i == 1) {
                result = first.stream().flatMap(x -> arrayList.stream().map(y -> Arrays.asList(x, y).stream().collect(Collectors.toCollection(ArrayList::new)))).collect(Collectors.toCollection(ArrayList::new));
            } else {
                result = result.stream().flatMap(x -> arrayList.stream().map(y -> Stream.concat(x.stream(), Arrays.asList(y).stream()).collect(Collectors.toCollection(ArrayList::new)))).collect(Collectors.toCollection(ArrayList::new));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList() {
            {
                add("a");
                add("b");
                add("c");
            }
        };

        ArrayList<String> arrayList2 = new ArrayList() {
            {
                add("1");
                add("2");
                add("3");
            }
        };

        ArrayList<String> arrayList3 = new ArrayList() {
            {
                add("A");
                add("B");
                add("C");
            }
        };
        ArrayList<ArrayList<String>> input = new ArrayList<>();
        input.add(arrayList1);
//        input.add(arrayList2);
//        input.add(arrayList3);

        System.out.println(getSetCombination(input));
    }
}