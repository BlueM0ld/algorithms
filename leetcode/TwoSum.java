class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int [2];
        for(int i =0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        
        for(int i =0; i<nums.length; i++){
           int tar = target - nums[i];
           
            if(map.containsKey(tar)){
                if(map.get(tar)==i){continue;}
                
                res[0] = i;
                res[1] = map.get(tar);
                break;
            }
            
        }
        
        return res;
    }
}


// 1st Attempt
// Runtime - 3ms
// Memory - 39.9 MB