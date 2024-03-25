class Solution {
    
    int[] nextElement(int[] heights)
    {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[heights.length];
        
        for(int i=heights.length-1; i>=0; i--)
        {
            if(st.isEmpty())
                res[i]=-1;
               
            
            
            else
            {
                while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                {
                    st.pop();
                }
                
                if(st.isEmpty())
                   res[i]=-1;
                else
                   res[i]=st.peek();
                
            }
             st.push(i);
        }
        return res;
        
    }
    
    int[] prevElement(int[] heights)
    {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[heights.length];
        
        for(int i=0; i<heights.length; i++)
        {
            if(st.isEmpty())
                res[i]=-1;
               
            
            
            else
            {
                while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                {
                    st.pop();
                }
                
                if(st.isEmpty())
                   res[i]=-1;
                else
                   res[i]=st.peek();
                
            }
             st.push(i);
        }
        return res;
        
    }
    
    
    public int largestRectangleArea(int[] heights) {
        
        int[] next = new int[heights.length];
        next=nextElement(heights);
        int[] prev = new int[heights.length];
        prev=prevElement(heights);
        
        int area = -1;
        
        for(int i=0;i<heights.length;i++)
        {
            if(next[i]==-1)
              next[i]=heights.length;  
            int newarea = (next[i]-prev[i]-1)*heights[i];
            area=Math.max(area,newarea);
            
        }
        
        return area;
        
        
    }
}