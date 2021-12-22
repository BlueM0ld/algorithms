package leetcode.string;

public class BalanceStrings {
    public int balancedStringSplit(String s) {
        
        int balancedCount=0;
        int r = 0;
        int l = 0;
        
        //Stack<Character> rl = new Stack<>();
        
        for(int i =0; i<s.length(); i++){
            
            if(s.charAt(i)=='R'){r++;}
            if(s.charAt(i)=='L'){l++;}
            
            if(r==l){balancedCount++;}
            
        }
        
        return balancedCount;
    }
}
