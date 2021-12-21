package leetcode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry =0;
        ListNode cc = new ListNode(0);
        ListNode finalTotal=cc;
        
        while(l1!=null || l2!=null || carry!=0){
            int x =0;
            int y =0;
            
            if(l1!=null){x = l1.val;}
            if(l2!=null){y = l2.val;}
            
            int total = x+y+carry;  

            
            if(total >= 10){
                carry = 1;
                total = total -10;
            }else{
                carry = 0;
            }

            finalTotal.next = new ListNode(total);
            finalTotal = finalTotal.next;
            
            if(l1!=null){l1 = l1.next;}
            if(l2!=null){l2=  l2.next;}

            
        }
        
        return cc.next;
    }
}
