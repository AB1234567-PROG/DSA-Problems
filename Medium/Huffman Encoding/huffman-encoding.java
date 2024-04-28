//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            int N = S.length();
            Solution ob = new Solution();
            String[] element = br.readLine().trim().split("\\s+");
		    int[] f = new int[N];
		    for(int i = 0; i < N; i++){
		        f[i] = Integer.parseInt(element[i]);
		    }
            ArrayList<String> res  = ob.huffmanCodes(S,f,N);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public void solution(String s, Huffman root, ArrayList<String> res)
    {
      
        if(root.left==null && root.right==null)
        {  res.add(s);
            return;
        }
        
        solution(s+'0',root.left,res);
        solution(s+'1',root.right,res);
       
    }
    
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        PriorityQueue<Huffman> min = new PriorityQueue<Huffman>(N, new MyComparator());
        ArrayList<String> res = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
           Huffman node = new Huffman(f[i]);
           min.add(node);
        }
        
        
        while(min.size()>1)
        {
            
            Huffman left= min.poll();
            Huffman right = min.poll();
            
            
            
            Huffman a = new Huffman(left.data + right.data);
            
            a.left = left;
            a.right= right;
            
            min.add(a);
        }
        
       Huffman root = min.poll();
       solution("",root,res);
       return res;
        
        
    }
}  
    


class Huffman {
    
    int data;
    
    Huffman left;
    Huffman right;
    
    Huffman(int d)
    {
        this.data=d;
        this.left=null;
        this.right=null;
    }
}

 class MyComparator implements Comparator<Huffman> { 
    public int compare(Huffman x, Huffman y) 
    { 
        if(x.data>=y.data)
        return 1;
        else 
        return -1;
    } 
} 