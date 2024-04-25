//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      obj.convertMinToMaxHeap(n,a);
      for(int e : a)
      {
          System.out.print(e+" ");
      }
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
   
 
    for(int i=N/2-1;i>=0;i--)
     {
         Heapify(arr,i,N);
         
     }
     
    }
    
    


    static void Heapify(int arr[], int j, int N)
    {
        int largest=j;
        int left = 2*j+1;
        int right = 2*j+2;
        
        if(left<N && arr[largest]<arr[left])
            largest=left;
         if(right<N && arr[largest]<arr[right]) 
             largest=right;
             
         while(largest!=j)
         {
             int t=arr[j];
             arr[j]=arr[largest];
             arr[largest]=t;
             j=largest;
             Heapify(arr,j,N);
             
         }
         
         
    }
   
  
}
     