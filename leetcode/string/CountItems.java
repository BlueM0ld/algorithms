package leetcode.string;

import java.util.List;

public class CountItems {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int i=0;
        int match = 0;
        
        if(ruleKey.equals("color")){ i = 1;}
        if(ruleKey.equals("name")){ i =2;}
        

        for (List<String> list : items) {
            
             if(list.get(i).equals(ruleValue)){
                 System.out.println(list.get(i));
                 match++;
             }
        }
        return match;
        
    }
}
