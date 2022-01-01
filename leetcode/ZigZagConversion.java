package leetcode;

public class ZigZagConversion {
      
    Map <Integer, String> map = new HashMap<>();
    public String convert(String s, int numRows) {
       
        String converted = "";
        Boolean reverse = false;
        int count = 1;
        for(int i =0; i<s.length(); i++){
            if(!reverse){
                checkMap(count, s.charAt(i));
                count++;
                if(count==numRows){reverse = true;}
            }else{
                checkMap(count, s.charAt(i));
                count--;
                if(count==1){reverse = false;}
            }
            
        } 
        for (String value : map.values()) {
            System.out.println("Value = " + value);
            converted = converted+value;
        }
        
        
        return converted;
    }
    
    public void checkMap(int row, char c ){     
        String s = "" + c;

        if(map.containsKey(row)){
            String newS = map.get(row) + s;
            map.put(row,newS);
        }else{
            map.put(row,s);
            
        }
    }
}  
}
