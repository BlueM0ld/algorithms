package leetcode;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        
        int numOfIslands =0;
        for(int i =0; i<grid.length;i++){
            for(int j =0; j<grid[i].length; j++){
                
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    
    public void dfs(char[][] matrix,int i ,int j ){
        
        if(i>=0 && j >=0 && i<matrix.length && j<matrix[0].length && matrix[i][j]=='1'){
        
                matrix[i][j] = '0';
                dfs(matrix, i,j-1);
                dfs(matrix, i+1,j);
                dfs(matrix, i-1,j);
                dfs(matrix, i,j+1); 
        }
    } 
}
