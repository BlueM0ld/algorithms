package leetcode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode tmp=head;
        
        while(head!=null){
            
            //ListNode prev = head;
            ListNode nexthead = head.next;
            
            if(nexthead==null){break;}

            if(head.val == nexthead.val){
                 
                head.next = nexthead.next;
            
            }else{
             head = head.next;
            }
            
        }
                
        return tmp;
        
    }
}
