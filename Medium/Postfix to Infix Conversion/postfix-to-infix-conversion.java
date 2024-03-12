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
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        
        Stack<String> st = new Stack<String>();
        String s1="";
        String s2="";
      
      for(int i=0;i<exp.length();i++)
      {
          if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/')
          {
              s1=st.pop();
              s2=st.pop();
              s1='('+s2+exp.charAt(i)+s1+')';
              st.push(s1);
          }
          else
              st.push(exp.substring(i,i+1));
      }
      
      s1=st.pop();
      return s1;
    }
}
