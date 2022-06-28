public class CountOddNumberInAnInterval {
    public int countOdds(int low, int high) {
        
        //         int numOdd = 0;
        //         for (int i=low; i <=high; i++) {
                    
        //             if(i%2!=0){
        //                 numOdd++;
        //             }
                    
        //         }
                
                int numOdd = 0;
                
                if(low%2!=0){
                    numOdd++;
                    low++;
                }
                if(high%2!=0){
                    numOdd++;
                    high--;
                }
                
                int cal = (high-low)/2;
                
                
                return numOdd+cal;
            }
}
