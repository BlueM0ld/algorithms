package leetcode;

public class BinarySearch {

    public static void main(String [] args){
        int [] nums = {2,5,7,10,13,17,25,35};
        //binary search
        //initalize the class obj
        BinarySearch bs = new BinarySearch();
        //pass the array
        // the length of the arr and the start with the number you want to find
        int index =  bs.search(nums,0,nums.length-1,2);
        System.out.println("Found at index "+ index);
    }

    public int search(int [] arr, int start, int end, int targetNum){
        if(start<=end) {
            int midpoint = start + (end - start) / 2;
            if (arr[midpoint] == targetNum) {
                return midpoint;
            }
            if (arr[midpoint] > targetNum) {
                return search(arr, start, midpoint - 1, targetNum);
            }
            if (arr[midpoint] < targetNum) {
                return search(arr, midpoint + 1, end, targetNum);
            }
        }
        return -1;
    }

}
