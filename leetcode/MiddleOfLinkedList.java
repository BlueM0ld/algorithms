package leetcode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        
        ListNode tmp = head;
        int len = 1;
        
        while(head.next!=null){
            
            len++;
            head = head.next;
        }
        
        int mid = len/2;
        
        for(int i =0; i<mid; i++){
            
            tmp = tmp.next;
        }
        
        return tmp;
    }
}

//TODO: Make this into a one pass solution 
