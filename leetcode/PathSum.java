package leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
              
        
        if(root==null){return false;}
         int target =  targetSum-root.val;
        if(root.left ==null && root.right == null && target ==0){ return true;}
        
        return hasPathSum(root.right, target) || hasPathSum(root.left, target);
        
    } 
}
