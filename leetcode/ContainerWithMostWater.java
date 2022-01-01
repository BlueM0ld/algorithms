package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int greatestArea = 0;
        
        int l = 0;
        int r = height.length-1;
    
        while(l<r){
            
            int diffL = Math.abs(r-l);
            int diffH = Math.min(height[l],height[r]);
            
            int max = diffL*diffH;
            
            if(max>greatestArea){greatestArea=max;}
            
            if(height[l]<height[r]){l++;}else{
                r--;
            }
        }
        
        return greatestArea;
    } 
}
