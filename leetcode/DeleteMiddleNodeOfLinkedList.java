package leetcode;

public class DeleteMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode headtmp = head;
        ListNode fin = headtmp;
        int len =1;
        while(head.next!=null){
            len++;
            head = head.next;
        }
        
        if(len ==1){return null;}
        int mid = len/2;
        
        for(int i =0; i<mid; i++){
            
            if(i==mid-1){
                headtmp.next = headtmp.next.next;
            }
            headtmp = headtmp.next;
        }
        
        return fin;
        
    }
}
