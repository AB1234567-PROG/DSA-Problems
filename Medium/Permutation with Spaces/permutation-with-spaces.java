//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        
        ArrayList<String> res = new ArrayList<>();
        
        String s = "";
        s+=S.charAt(0);
        String sb= S.substring(1);
        
        return generate(res,s,sb);
        
    }
       ArrayList<String> generate(ArrayList<String> res,String s, String sb)
        {
           if(sb.length()==0)
           {
               res.add(s);
               return res;
           }
           
           char c = sb.charAt(0);
           generate(res,s+" "+c, sb.substring(1));
           generate(res,s+c, sb.substring(1));
           
           return res;
           
        }
    
    
}