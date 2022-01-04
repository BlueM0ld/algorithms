package leetcode;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> allCombinations = new ArrayList<>();
        //base case
        if(digits.length()==0){return allCombinations;}
        
        
        //initialize a String arr
        String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        backtrack(map,"",allCombinations,digits.toCharArray());

        return allCombinations;
    }
    
    public void backtrack(String [] map, String comb , List<String> permutations, char [] digits ){
        
        if(comb.length()==digits.length){
            permutations.add(comb);
            return;
        }
        
        int combLen = comb.length();
        
        //this converts the char value of the first indx in the input arr to a number
        int j = digits[combLen] - '0';
        
        //Then we the string mapped to that index and convert it to a char arr for ex 2 -> a,b,c
        char [] numberMap = map[j].toCharArray();
     
        //Loop through the length of the mapped chars for that number
        for(int i = 0; i<numberMap.length; i++){
            
            String add = "" + numberMap[i];
            backtrack(map,comb+add,permutations, digits);
        }
    } 
}
