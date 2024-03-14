//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        int o=n,c=n;
        String s="";
        List<String> res = new ArrayList<String>();
        return generate(o,c,n,s,res);
    }
    
    List<String> generate(int o,int c,int n,String s,List<String> res)
    {
        if(o==0 && c==0)
        {
            res.add(s);
            return res;
        }
        if(o>0)
        generate(o-1,c,n,s+'(',res);
        if(c>o)
        generate(o,c-1,n,s+')',res);
        return res;
    }
}