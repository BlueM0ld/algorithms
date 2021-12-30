package leetcode;

import java.util.Set;

public class validSudoku {

    class Solution {
        public boolean isValidSudoku(char[][] board) {
            
            
            Set set = new HashSet();
            
            for(int i = 0 ; i<9; i++){
                for(int j =0; j<9; j++){
                    char boardPosition = board[i][j];
                    if(boardPosition != '.'){
                        if(!set.add(boardPosition + "seen in the row"+ i)
                            || !set.add(boardPosition + "seen in the column"+j)
                            || !set.add(boardPosition + "seen in the box [" + i/3 +"]["+ j/3+"]" )
                          ){
                            return false;
                        }
                        
                    }
                }
                
            }
            return true;
        }
    }
    
}
