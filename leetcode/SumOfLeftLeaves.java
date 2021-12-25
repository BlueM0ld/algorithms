package leetcode;

public class SumOfLeftLeaves {

        public int sumOfLeftLeaves(TreeNode root) {
            
            if(root.left==null && root.right ==null){return 0;}
            
            sum(root,false);
            
            return sum;
        }
        
        public void sum(TreeNode node,boolean left){
            
            
            if(node == null){return ;}
            
            if(node.left==null && node.right==null && left){
                
                 sum += node.val;
            }
                 sum(node.left,true );
                 sum(node.right,false);
            
        }
}
