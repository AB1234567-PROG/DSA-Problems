//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToPost(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static String preToPost(String pre_exp) {
        
        Boolean flag=false;
        String res="";
        Stack<String> st = new Stack<String>();
        
        for(int i=pre_exp.length()-1; i>=0; i--)
        {
            if(pre_exp.charAt(i)=='*'||pre_exp.charAt(i)=='-'||pre_exp.charAt(i)=='/'||pre_exp.charAt(i)=='+')
            {
                String s1=st.pop();
                String s2=st.pop();
                s1 = s1+s2+pre_exp.charAt(i);
                st.push(s1);
            }
            
            else
                
            st.push(pre_exp.substring(i,i+1));
            
                
                    

            }
            
             String s3=st.pop();
            res=s3;
            
            return res;
        }
}
        

    

