//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
      
      int count=0;
      
      for(int i=1;i<A.length;i++)
      {
          if(A[i]==A[i-count-1])
         { 
             count++;
            A[i]=0;
             
         }
         
         else if(A[i-1]==0)
         {
             int j=i;
             while(A[j-1]==0)
             {
             int t=A[j];
             A[j]=A[j-1];
             A[j-1]=t;
             j--;
             }
         }
         else
         continue;
      }
      
      return N-count;
    }
}