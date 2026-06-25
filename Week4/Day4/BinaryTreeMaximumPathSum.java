public class BinaryTreeMaximumPathSum {
    
    int MaxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        ans(root);
        return MaxSum;
    }

    private int ans(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(0 , ans(root.left));
        int right = Math.max(0 , ans(root.right));

        MaxSum = Math.max(MaxSum , left + right + root.val);

        return root.val + Math.max(left , right);
    }
}
