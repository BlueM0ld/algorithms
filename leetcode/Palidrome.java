package leetcode;
public class Palidrome {
    
    public boolean isPalindrome(int x) {
        
        String number = Integer.toString(x);
        
        String reverse = new StringBuffer(number).reverse().toString();
                
        if(reverse.equals(number)){return true;}
        
        return false;
        
        
    }
}
