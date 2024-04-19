//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
        
        Long nextLong(){
            return Long.parseLong(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			long arr[] = new long[n];
			
			for(int i=0; i<n; i++)
				arr[i] = sc.nextLong();
		    out.println(new Solution().minCost(arr, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> minheap = new PriorityQueue<>();
        long sum=0,total=0;
        int k=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--)
        {
            minheap.add(arr[i]);
        }
        
        while(!minheap.isEmpty())
        {
            sum+=minheap.poll();
            k++;
            if(k==2)
            {
                total+=sum;
                minheap.add(sum);
                k=0;
                sum=0;
            }
        }
        return total;
    }
}