class Solution {
    public boolean search(int[] nums, int target) {
        
        int l=0,h=nums.length-1;
            
      boolean left = sortl(nums,target,l,h);
        boolean right = sortr(nums,target,l,h);
        
        if(left==true || right==true)
            return true;
        else
            return false;
        
    }
    
    boolean sortl(int[] nums,int target,int l, int h)
    {
        int mid=(l+h)>>1;
        if(l<=h && nums[mid]!=target)
        {  
            sortl(nums,target,l,mid-1);
            sortr(nums,target,mid+1,h);
             if(sortl(nums,target,l,mid-1)==true || sortr(nums,target,mid+1,h)==true)
              return true;
            else
                return false;
        }
        
        else if(l>h)
            return false;
        
        else
            return true;
        }
    
    boolean sortr(int[] nums,int target,int l, int h)
    {
        int mid=(l+h)>>1;
        if(l<=h && nums[mid]!=target)
        {   
            sortl(nums,target,l,mid-1);
            sortr(nums,target,mid+1,h);
            if(sortl(nums,target,l,mid-1)==true || sortr(nums,target,mid+1,h)==true)
              return true;
            else
                return false; 
        }
        
        else if(l>h)
            return false;
        
        else
            return true;
        
    }
}