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
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            String ans = obj.minWindow(s1, s2);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String minWindow(String str1, String str2) {
        
        int i=0, start=0;
        String res="";
        
        int count = str2.length(),minlen=Integer.MAX_VALUE;
        int count2=0;
    
      
      for(int j=0;j<str2.length();j++)
      {
          while(i<str1.length() && str1.charAt(i)!=str2.charAt(j))
          {
              i++;
          }
          
              count2++;
              
           if(count2==1)
              start=i;
          
          if(count==count2)
          {
              if(minlen>i-start+1)
              {
                  minlen=i-start+1;
                 if(i<str1.length())
                  res=str1.substring(start,i+1);
              }
              
              if(start<str1.length() && str1.charAt(start)==str2.charAt(0))
              {
                  count2=0;
                  j=-1;
              }
              start++;
              i=start;
          }
          
          else
          i++;
      }
      return res;
    }
}
