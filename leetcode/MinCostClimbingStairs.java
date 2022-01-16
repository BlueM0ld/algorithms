package leetcode;
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        
        int s = cost.length;
        int [] stairs = new int [s];

        stairs[0] = cost[0];
        stairs[1]= cost[1];
        
        
        for(int i=2; i<s; i++){
            stairs[i] = cost[i] + Math.min(stairs[i-1],stairs[i-2]);
        }
        
        return Math.min(stairs[s-1],stairs[s-2]);
        
    }
        
}
