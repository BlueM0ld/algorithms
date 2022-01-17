package leetcode;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {

        int sum = 0;
        if(root==null){return 0;}
        
        if(root.val>=low && root.val<=high){sum = sum + root.val;}
        
        
        return sum + rangeSumBST(root.right, low,high) + rangeSumBST(root.left, low,high);
        
    }
    
}
