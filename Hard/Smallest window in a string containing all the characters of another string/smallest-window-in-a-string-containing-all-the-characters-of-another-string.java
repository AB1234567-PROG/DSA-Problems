//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
       HashMap<Character,Integer> hm1 = new HashMap<>();
       
       HashMap<Character,Integer> hm2 = new HashMap<>();
       int count2=0;
       
       for(int i=0;i<p.length();i++)
       {
           hm1.put(p.charAt(i),hm1.getOrDefault(p.charAt(i),0)+1);
          
       }
       
       int count = hm1.size();
       boolean flag = false;
       int start=0, minlen=Integer.MAX_VALUE;
       String res="";
       
       for(int i=0;i<s.length();i++)
       {
           if(hm1.containsKey(s.charAt(i)))
             {
                     hm2.put(s.charAt(i),hm2.getOrDefault(s.charAt(i),0)+1);
                     if(hm1.get(s.charAt(i))==hm2.get(s.charAt(i)))
                     count2++;
                         
                      if(flag==false)
                 {
                     flag=true;
                     start=i;
                 }
                     
                     
                   while(count==count2)
                   {
                       if(minlen>i-start+1)
                     {
                         minlen=i-start+1;
                         res=s.substring(start,i+1);
                     }
                     
                       if(hm2.containsKey(s.charAt(start)))
                     {
                         hm2.put(s.charAt(start),hm2.get(s.charAt(start))-1);
                         if(hm1.get(s.charAt(start))>hm2.get(s.charAt(start)))
                         count2--;
                     }
                       
                      start++;
                   }
                  }
                 
                 
                 }
                        
    if(res=="")
    return "-1";
    return res;        
    }
}