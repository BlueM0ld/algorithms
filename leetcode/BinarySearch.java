package leetcode;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target){return 0;}

        return binarySearch(target, nums, 0,nums.length-1);
    
    }
    
    public int binarySearch(int tar, int[] arr, int start, int end){
        
        int mid = start + (end-start)/2;
        
        while(start<=end){
                
            System.out.print(arr[mid] + " " + tar + " " );
            if(tar>arr[mid]){
               return binarySearch(tar,arr,mid+1,end);
            }
            if(tar<arr[mid]){
               return binarySearch(tar,arr,start,mid-1);
            }
            if(tar==arr[mid]){return mid;}
        }
        return -1;
    }

}
