package leetcode;

public class MaxProd {
    public int maxProduct(int[] nums) {
     
        int max = -100;
        int min = -100;
        
        int total = 0;
        
        for(int i =0; i< nums.length; i++){
            
            if(nums[i]>max){
                min = max;
                max = nums[i];
            }
            else if(nums[i]>min){min = nums[i];}
            
            int tempTotal = (min-1)*(max-1);
            if(tempTotal>total){total = tempTotal;}
            
        }
        
        return total;
    }
}
