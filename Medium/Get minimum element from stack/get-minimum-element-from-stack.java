//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();
    
    // Constructor    
    GfG()
	{
     
	}
	
    /*returns min element from stack*/
   
    int res=0;
    int getMin()
    {
     if(!s.isEmpty())
	return res;
	else
	return -1;
    }
    
    
    /*returns poped element from stack*/
    int pop()
    {
	   if(!s.isEmpty())
	   {
	  
	       int i=s.peek();
	       if(i<res)
	       {
	           int prevmin=res;
	           int val = 2*res-i;
	           res=val;
	           s.pop();
	           return prevmin;
	       }
	       else
	       return s.pop();
	        
	   }
	   
	   else
	   return -1;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	   if(s.isEmpty())
	   {
	       res=x;
	
	       s.push(x);
	   }
	   
	   else if(x<res)
	   {
	       int val = 2*x-res;
	       s.push(val);
	       res=x;
	   }
	   
	   else
	    s.push(x);
	   
    }	
}

