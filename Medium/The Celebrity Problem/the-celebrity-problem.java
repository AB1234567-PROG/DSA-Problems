//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    
    boolean isEmpty(int M[][], int col, int n)
    {
        for(int k=0;k<n;k++)
        {
            if(M[col][k]==1)
                return false;
        }
        return true;
    }
    
    
    int celebrity(int M[][], int n)
    {
       int row=0,tc=0;
        for(int col=1;col<n;col++)
        {
          if(M[row][col]==1)
          {
              if(isEmpty(M,col,n))
              {
                  int count=0;
                  for(int i=1;i<n;i++)
                  {
                      
                      if(i==col)
                      continue;
                      else if(M[i][col]==0)
                      break;
                      else
                      count++;
                      
                  }
                  if(count==n-2)
                    return col;
              }
          }
    }
    
    int i=0;
    for(int j=1;j<n;j++)
    {
        if(M[j][i]==0)
        return -1;
    }
    return 0;
}}