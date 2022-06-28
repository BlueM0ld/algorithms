package leetcode;
public class Palidrome {
    
    public boolean isPalindrome(int x) {
        
        String number = Integer.toString(x);
        
        String reverse = new StringBuffer(number).reverse().toString();
                
        if(reverse.equals(number)){return true;}
        
        return false;
        
        
    }

    public boolean isPalindromeSolTwo(int x) {
     
        char [] arr = String.valueOf(x).toCharArray();
        
        for(int i = 0 ; i<arr.length; i++){
            
            if(arr[i] != arr[(arr.length-1)-i]){
                return false;
            }
        }
        
        return true;
        
    }
}
