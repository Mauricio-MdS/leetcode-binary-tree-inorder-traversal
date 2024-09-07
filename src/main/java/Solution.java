/* RECURSIVE SOLUTION
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
            traversal(root, values);
        return values;
    }

    private void traversal(TreeNode root, List<Integer> values) {
        if (root == null) return;

        traversal(root.left, values);
        values.add(root.val);
        traversal(root.right, values);
    }
}

*/

import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        while (root != null || !nodeStack.isEmpty()) {
            while (root != null) {
                nodeStack.add(root);
                root = root.left;
            }
            root = nodeStack.pop();
            values.add(root.val);
            root = root.right;
        }
        return values;
    }
}