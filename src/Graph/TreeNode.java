package Graph;


public class TreeNode {
    int val;
    AMZN.TreeNode left;
    AMZN.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, AMZN.TreeNode left, AMZN.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

