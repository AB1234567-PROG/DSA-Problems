class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        long[] res1 = new long[arr.length];
              res1 = leftmin(arr);
        int[] res2 = new int[arr.length];
              res2 = rightmin(arr);
        for(int i=0; i<res1.length;i++)
        {
            res1[i]=i-res1[i];
        }
        
        for(int i=0; i<res2.length;i++)
        {
            res2[i]=res2[i]-i;
        }
        for(int i=0; i<res1.length;i++)
        {
            res1[i]=res1[i]*res2[i];
            res1[i]=res1[i]*arr[i];
        }
        long sum=0;
        for(long i:res1)
        {
            sum+=i;
        }
        long res=0;
        long mod=1000000007;
         res=sum%mod;
        return (int)res;
    }
    
    long[] leftmin(int[] arr)
    {
        long[] left = new long[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(!st.isEmpty())
            {
                 while(!st.isEmpty() && arr[i]<arr[st.peek()])
                 {
                       st.pop();
                }
                       if(st.isEmpty())
                       left[i]=-1;
                       else
                       left[i]=st.peek();
                   }
                  
                 
            
            
            else
             left[i]=-1;   
            
            st.push(i);
            
                
        }
        return left;
    }
    
    int[] rightmin(int[] arr)
    {
        int[] right = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--)
        {
            if(!st.isEmpty())
            {
                while(!st.isEmpty() && arr[i]<=arr[st.peek()])
                {
                   st.pop();
                }
                 if(st.isEmpty())
                       right[i]=arr.length;
                       else
                       right[i]=st.peek();
                   
                 }
            else
              right[i]=arr.length;  
            
            st.push(i);
            
                
        }
        return right;
    }
}