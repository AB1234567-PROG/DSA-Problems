//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 
System.out.println("~");
}
	 }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int[] nums = new int[26];
        
        for(int i=0;i<line.length();i++)
        {
              int j=line.charAt(i)-'a';
              nums[j]++;
        }
        
        int n=nums[0]; int ind=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>n)
            {
                n=nums[i];
                ind=i;
            }
            
        }
        
        return (char)(ind+'a');
    }
    
}