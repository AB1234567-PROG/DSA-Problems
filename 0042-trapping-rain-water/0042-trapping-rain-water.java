class Solution {
    
    int[] max_left(int[] height)
    {
        int[] res = new int[height.length];
        
        int max=0;
        
        for(int i=0; i<height.length; i++)
        {
            if(i==0)
            {
                res[i]=-1;
                max=height[i];
            }  
            else if(height[i]<max)
                res[i]=max;
            else
             {   res[i]=-1;
                max=height[i];
             }
        }
            
           return res;     
            
        }
    
    
    int[] max_right(int[] height)
    {

        int[] res = new int[height.length];
        int max=0;
        
        for(int i=height.length-1; i>=0; i--)
        {
            if(i==height.length-1)
            {
                res[i]=-1;
                max=height[i];
            }  
            else if(height[i]<max)
                res[i]=max;
            else
            {
                res[i]=-1;
                max=height[i];
            }
        }
            
           return res;     
            
        }
    
    public int trap(int[] height) {
        
       int[] maxleft =new int[height.length];
        maxleft = max_left(height);
        int[] maxright =new int[height.length];
       maxright = max_right(height);
        
        int sum=0;
        
        for(int i=0; i<height.length;i++)
        {
            if(maxleft[i]==-1 || maxright[i]==-1)
                continue;
            sum+=Math.min(maxleft[i],maxright[i])-height[i];
        }
        return sum;
    }
}