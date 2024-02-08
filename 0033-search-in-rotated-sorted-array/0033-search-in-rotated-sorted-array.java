class Solution {
    public int search(int[] nums, int target) {
        
        int l=0,h=nums.length-1;
            
      int left = sortl(nums,target,l,h);
        int right = sortr(nums,target,l,h);
        
        return Math.max(left,right);
        
    }
    
    int sortl(int[] nums,int target,int l, int h)
    {
        int mid=(l+h)>>1;
        if(l<=h && nums[mid]!=target)
        {  
            sortl(nums,target,l,mid-1);
            sortr(nums,target,mid+1,h);
             return Math.max(sortl(nums,target,l,mid-1),sortr(nums,target,mid+1,h));
        }
        
        else if(l>h)
            return -1;
        
        else
            return mid;
        }
    
    int sortr(int[] nums,int target,int l, int h)
    {
        int mid=(l+h)>>1;
        if(l<=h && nums[mid]!=target)
        {   
            sortl(nums,target,l,mid-1);
            sortr(nums,target,mid+1,h);
             return Math.max(sortl(nums,target,l,mid-1),sortr(nums,target,mid+1,h));
        }
        
        else if(l>h)
            return -1;
        
        else
            return mid;
        
        }
    }