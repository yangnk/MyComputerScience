package algorithms.leetcode.archive2022.archive10.lc1001;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution3 {
    Set<TreeNode> retSet = new HashSet<>();
    Map<String, TreeNode> subTreeMap = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(retSet);
    }

    @org.jetbrains.annotations.NotNull
    private String dfs(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("(");
        sb.append(dfs(root.left));
        sb.append(")(");
        sb.append(dfs(root.right));
        sb.append(")");
        String serial = sb.toString();
        if (subTreeMap.containsKey(serial)) {
            retSet.add(subTreeMap.get(serial));
        } else {
            subTreeMap.put(serial, root);
        }
        return serial;
    }
}
