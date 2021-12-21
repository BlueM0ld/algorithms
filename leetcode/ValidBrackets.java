package leetcode;

import java.util.Stack;

public class ValidBrackets {
    public boolean isValid(String s) {
        
        
        Stack<Character> brackets = new Stack<>();
        
        for(int i =0; i< s.length(); i++){
            
            char bracketType = s.charAt(i);
            
            if(bracketType == '(' || bracketType=='{' || bracketType == '['){
                brackets.add(bracketType); 
                continue;
            }
            
            
            if(brackets.isEmpty()){return false;}
            char peekBracket = brackets.peek();
           
            if(peekBracket == '{' && bracketType != '}'){break;}        
            if(peekBracket == '(' && bracketType != ')'){break;}        
            if(peekBracket == '[' && bracketType != ']'){break;}                
            
            brackets.pop();
        }
        
        return brackets.isEmpty();
        
    } 
}
