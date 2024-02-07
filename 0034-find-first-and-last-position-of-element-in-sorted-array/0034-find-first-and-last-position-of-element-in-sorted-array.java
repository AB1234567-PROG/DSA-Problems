class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = {-1,-1};
        int l=0,h=nums.length-1;
        res[0]=first(nums,target,l,h);
        res[1]=last(nums,target,l,h);

         return res;
        }

    public int first(int[] nums, int target, int l, int h)
    {
        int first=-1;
          while(l<=h)
        {
            int mid = (l+h)>>1;

         if(target>nums[mid])
            {
                l=mid+1;
            }
            
            else if((mid!=0 && target==nums[mid] && target!=nums[mid-1]) || (mid==0 &&                                   target==nums[mid]))
            {    first=mid;
                return first;
                  
            }
            else
            {
                h=mid-1;
            }
            
        }
      return -1;

    }

    public int last(int[] nums, int target, int l, int h)
    {
        int last=-1;
         while(l<=h)
        {
            int mid = (l+h)>>1;
            if(target<nums[mid])
            {
                h=mid-1;
            }
            
            else if((mid!=nums.length-1 && target==nums[mid] && target!=nums[mid+1]) ||                                      (mid==nums.length-1 && target==nums[mid]))
            {    last=mid;
                  return last;
                  
            }
            else
            {
                l=mid+1;
            }
           
        }
       return -1;

    }


}