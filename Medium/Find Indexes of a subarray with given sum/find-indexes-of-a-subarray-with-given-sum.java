//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         ArrayList<Integer> al = new ArrayList<>();
         int sum=0;
         
         if(arr.length==1 && arr[0]==s)
         {
                al.add(1);
                al.add(1);
                return al;
         }
         
         if(s==0)
         {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    al.add(i+1);
                    al.add(i+1);
                    return al;
                }
            }
             al.add(-1);
             return al;
         }
    
         int j=0;
         for(int i=0;i<n;i++)
         {
             if(sum<s)
             sum+=arr[i];
             else if(sum>s)
             {  
                 
                 while(sum>s)
                 {
                     
                     sum-=arr[j];
                     j++;
                     
                 }
                 
                 if(sum==s)
                 {
                     al.add(j+1);
                     al.add(i);
                     return al;
                 }
                 
                 else
                 sum+=arr[i];
             }
             else
             {
                al.add(j+1);
                al.add(i);
                return al;
             }
         }
         if(sum==s)
                 {
                     al.add(j+1);
                     al.add(n);
                     return al;
                 }
                 
         else if(sum>s)
             {  
                 
                 while(sum>s)
                 {
                     
                     sum-=arr[j];
                     j++;
                     
                 }
                 
                 if(sum==s)
                 {
                     al.add(j+1);
                     al.add(n);
                     return al;
                 }         
             }         
         
         
         al.add(-1);
         return al;
    }
}