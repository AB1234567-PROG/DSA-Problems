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
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
      
      String s1="";
      String s2="";
      Stack<String> st = new Stack<String>();
      
      
      for(int i=pre_exp.length()-1;i>=0;i--)
      {
          if(pre_exp.charAt(i)=='*'|| pre_exp.charAt(i)=='-'|| pre_exp.charAt(i)=='/'|| pre_exp.charAt(i)=='+')
          {
             s1=st.pop();
             s2=st.pop();
             s1='('+s1+pre_exp.charAt(i)+s2+')';
             st.push(s1);
          }
          
          else 
          st.push(pre_exp.substring(i,i+1));
          
      }
      
      s1=st.pop();
            
      return s1;
    }
}
