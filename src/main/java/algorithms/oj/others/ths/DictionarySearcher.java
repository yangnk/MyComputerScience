package algorithms.oj.others.ths;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

// input:
//         1. input_file
//         每一行有一个词汇，如“浙江”, “浙江大学”, “美国”, “美国政府”。该文件可能有100万词
//         2. a document，字符串。一般有2000字左右。如 “美国规划协会中国办公室揭牌仪式及美国规划领域合作研讨会在浙江大学城乡规划设计研究院208会议室举行。美国规划协会CEO James Drinan，国际项目及外联主任Jeffrey Soule先生，浙江大学党委副书记任少波，浙江大学控股集团领导杨其和，西湖区政府代表应权英副主任....”
//
//         output:
//         输出document中出现的词汇,以及其位置列表。如
//         {
//         “美国” : [ 0,16, ....],
//         “浙江”: [28, ...]
//         “浙江大学”: [28, ...]
//         }
public class DictionarySearcher {
    String[] words;

    //构造方法，将关键词字符串切分为数组
    public DictionarySearcher(String filename) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        words = arrayList.toArray(new String[arrayList.size()]);
    }

    public HashMap<String, ArrayList<Integer>> search(String document) {
        HashMap<String, ArrayList<Integer>> output = new HashMap<String, ArrayList<Integer>>();
        String[] documents = document.split("");
        for (String item : words) {
            ArrayList<Integer> count = KMP(documents, item);
            if (!count.isEmpty()) {
                output.put(item, count);
            }
        }
        return output;
    }

    private ArrayList<Integer> KMP(String[] documents, String ps) {
        String[] p = ps.split("");
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int[] next = getNext(ps);
        while (i < documents.length && j < p.length) {
            if (j == -1 || documents[i].equals(p[j])) {
                i++;
                j++;
            } else {
                j = next[j];
            }
            if (j == p.length) {
                indexs.add(i - j);
                j = 0;
                next = getNext(ps);
            }
        }
        return indexs;
    }

    private int[] getNext(String ps) {
        int length = ps.length();
        int[] next = new int[length];
        String[] strchar = ps.split("");
        int j = 0;
        int k = -1;
        next[0] = -1;
        while (j < length - 1) {
            if (k == -1 || strchar[j].equals(strchar[k])) {
                j++;
                k++;
                if (!strchar[j].equals(strchar[k])) {
                    next[j] = k;
                } else {
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String filename = "src/main/java/algorithms/oj/ths/test.txt";
        String document = "美国规划协会中国办公室揭牌仪式及美国规划领域合作研讨会在浙江大学城乡规划设计研究院208会议室举行。" + "美国规划协会CEO James Drinan，国际项目及外联主任Jeffrey Soule先生，浙江大学党委副书记任少波，" + "浙江大学控股集团领导杨其和，西湖区政府代表应权英副主任....";
        DictionarySearcher dictionarySearcher = new DictionarySearcher(filename);
        System.out.println(dictionarySearcher.search(document));
    }
}