//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int[] res=new int[2];
        
        int xr=0;
        
        for(int i=0;i<arr.length;i++)
        {
            xr=xr^arr[i];
            xr=xr^(i+1);
        }
        
        int number = xr & ~(xr-1);
        int zero=0;
        int one=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]&number)!=0)
              one=one^arr[i];
              else
              zero=zero^arr[i];
              
            if(((i+1) & number)!=0)
            one=one^(i+1);
            else
            zero=zero^(i+1);
        }
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==zero)
            count++;
        }
        
        if(count==2)
        {res[0]=zero;
         res[1]=one;
        }
        
        else
        {res[1]=zero;
         res[0]=one;
            
        }
        return res;
        
    }
}