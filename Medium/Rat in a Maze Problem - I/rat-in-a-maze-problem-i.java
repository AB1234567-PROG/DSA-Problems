//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        ArrayList<String> res = new ArrayList<>();
        int x=0,y=0;
        String s="";
         if(m[0][0]==0)
            return res;
        int[][] visit = new int[n][n];
        return solve(x,y,res,visit,s,m,n);
    }
    
        static ArrayList<String> solve(int x,int y,ArrayList<String> res, int[][] visit, String s, int[][] m, int n)
        {
            if(x==n-1 && y==n-1)
            {
                res.add(s);
                return res;
            }
            
            visit[x][y]=1;
            
            if(isSafe(x+1,y,visit,m,n))
            {
                solve(x+1,y,res,visit,s+'D',m,n);
                
            }
            
            if(isSafe(x,y-1,visit,m,n))
            {
                solve(x,y-1,res,visit,s+'L',m,n);
            }
            
            if(isSafe(x,y+1,visit,m,n))
            {
                solve(x,y+1,res,visit,s+'R',m,n);

            }
            
            if(isSafe(x-1,y,visit,m,n))
            {
                solve(x-1,y,res,visit,s+'U',m,n);
            }
            
              visit[x][y]=0;
            return res;
            
        }
        
        static boolean isSafe(int newx,int newy,int[][] visit,int[][] m,int n)
        {
            if(newx>=0 && newx<n && newy>=0 && newy<n && m[newx][newy]==1 && visit[newx][newy]==0)
            return true;
            return false;
        }
        
        
}