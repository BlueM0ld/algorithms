package leetcode;

public class ClimbingStairs {

    public int climbStairs(int n) {
        
        int [] steps = new int[46];
        steps[0] = 0;
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 3;
        
        
        for(int i =4; i<=45;i++){
            
            steps[i] = steps[i-1]+steps[i-2];
        }
        
        return steps[n];
    }
}
}
