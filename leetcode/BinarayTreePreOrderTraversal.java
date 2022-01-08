package leetcode;

public class BinarayTreePreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preOrder = new ArrayList<>();
        
        if(root==null){return preOrder;}
         preOrder.add(root.val);
         preOrder.addAll(preorderTraversal(root.left));
         preOrder.addAll(preorderTraversal(root.right));
        
        return preOrder;
        
    }
}
