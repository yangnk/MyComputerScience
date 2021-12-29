package dataStructureAndAlgorithms.oj;

import java.util.HashMap;
import java.util.Stack;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-22 20:52
 **/
public class BD122 {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        HashMap<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        String tmp = "";
        String tmp1 = "";
        for (int i = 0; i < s.length(); i++) {
            tmp = String.valueOf(s.charAt(i));
            if (tmp.equals("(")||tmp.equals("[")||tmp.equals("{")) {
                stack.push(tmp);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                tmp1 = stack.pop();
                if (!tmp1.equals(map.get(tmp))) {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
