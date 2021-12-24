package leetcode;

public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        
        boolean l2Smaller;
        
        if(l1.val>l2.val){
            l2Smaller = true;
        }else{
            l2Smaller = false;
        }
        
        ListNode node;
        if(l2Smaller){
            node = l2;
            node.next = mergeTwoLists(l1,l2.next);
            
        }else{
            node = l1;
            node.next = mergeTwoLists(l1.next,l2);
        }
        
        return node;
        
    }
}
