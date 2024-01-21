//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java





class Solution {
    String solve(int[] arr, int n) {
      
      StringBuilder s1 = new StringBuilder("");
      StringBuilder s2 = new StringBuilder("");
      Integer ar = new Integer(0);
      
      Arrays.sort(arr);
      
      for(int i=0;i<arr.length;i++)
      {
          ar = new Integer(arr[i]);
          if(i%2==0)
          s1.append(ar);
          else
          s2.append(ar);
      }
      
      return sumof(s1,s2);
    }
    
    String sumof(StringBuilder s1, StringBuilder s2)
    {
        int i=s1.length()-1;
        int j=s2.length()-1;
        StringBuilder sum = new StringBuilder("");
        int carry=0;
        
        while(i>=0 && j>=0)
        {
            Integer ar1 = new Integer(0);
            int d1=s1.charAt(i)-'0';
            int d2=s2.charAt(j)-'0';
            ar1 = new Integer((d1+d2+carry)%10);
            sum.append(ar1);
            carry=(d1+d2+carry)/10;
            i--;
            j--;
        }
        
        while(i>=0)
        {
            Integer ar1 = new Integer(0);
            int d1=s1.charAt(i)-'0';
            ar1 = new Integer((d1+carry)%10);
            sum.append(ar1);
            carry=(d1+carry)/10;
            i--;
        }
        
        while(j>=0)
        {
            Integer ar1 = new Integer(0);
            int d2=s2.charAt(j)-'0';
            ar1 = new Integer((d2+carry)%10);
            sum.append(ar1);
            carry=(d2+carry)/10;
            j--;
        }
        
        if(carry!=0)
        {Integer ar1 = new Integer(carry);
          sum.append(ar1);
        }
        String res="";
        
        StringBuilder reversedString = new StringBuilder();
        reversedString=sum.reverse();
        res=reversedString.toString();
        for(int k=0;k<res.length();k++)
        {
            
            if(res.charAt(k)!='0')
            return res.substring(k);
        }
        return "0";
    }
}
