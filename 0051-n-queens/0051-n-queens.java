class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>();
        int[][] board = new int[n][n];
        return solve(res,board,n,0);
    }

    List<List<String>> addsol(List<List<String>> res, int[][] board, int n)
    {
        String s="";
        List<String> temp = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(board[i][j]==1)
            s+='Q';
            else
            s+='.';
             } 
             temp.add(s);
             s=""; 
            }
            
            res.add(temp);
            return res;
        }
    
    List<List<String>> solve(List<List<String>> res, int[][] board, int n, int row)
    {
        if(row==n)
        {
          return addsol(res,board,n); 
              
        }
          for(int col=0;col<n;col++)
          {
              if(isSafe(row,col,n,board))
              {
                  board[row][col]=1;
                  solve(res,board,n,row+1);
                  board[row][col]=0;
              }
          }
        
          return res;
        
       
        }
        

    boolean isSafe(int row,int col,int n,int[][] board)
    {
        int x=row;
        int y=col;
        while(x>=0)
        {
            if(board[x][y]==1)
              return false;
            x--;  
        }

            x=row;
            y=col;
        while(x>=0 && y>=0)
        {
            if(board[x][y]==1)
                return false;
            x--;
            y--;    
        }

             x=row;
             y=col;
        while(x>=0 && y<n)
        {
            if(board[x][y]==1)
                return false;
            x--;
            y++;    
        }
        return true;
    }
}