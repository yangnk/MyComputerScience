package dataStructureAndAlgorithms.oj.others.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-06 16:59
 **/
public class Test0506 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<ArrayList<String>> arrayListStream1 = arrayList1.stream()
                .flatMap(x->arrayList2.stream()
                .map(y-> Arrays.asList(x,y).stream().collect(Collectors.toCollection(ArrayList::new))))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(arrayListStream1.toString());
    }
}
