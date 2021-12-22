package leetcode.string

/**
 * ValueAfterOperations
 */
public class ValueAfterOperations {

    public int finalValueAfterOperations(String[] operations) {
        
        int x = 0;
        
        for(int i =0; i<operations.length; i++){
            
            if(operations[i].contains("+")){
                x++;
                continue;
            }
            x--;
        }
        
        return x;
        
    }
}