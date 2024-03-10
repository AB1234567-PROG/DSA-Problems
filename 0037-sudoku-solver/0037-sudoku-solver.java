class Solution {
    public void solveSudoku(char[][] board) {
        
        solve(board);
    }
    
    boolean isSafe(int i, int j, char val, char[][]board)
    {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][j]==val)
                return false;
        }
        
        for(int col=0;col<board.length;col++)
        {
            if(board[i][col]==val)
                return false;
        }
        
        for(int k=0;k<board.length;k++)
        {
            if(board[3*(i/3)+k/3][3*(j/3)+k%3]==val)
                return false;
        }
        
        return true;
        
    }
    boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char val='1';val<='9';val++)
                    {
                        if(isSafe(i,j,val,board))
                        { 
                          board[i][j]=val;
                          boolean fursol=solve(board);
                          if(fursol)
                          return true;
                          
                          else 
                          board[i][j]='.';   
                    }
                }
              return false;      
            }
            
        }
        }
        
     return true;   
    
    }      
}