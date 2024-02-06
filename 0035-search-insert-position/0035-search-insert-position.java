class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        
        int l=0,h=nums.length-1;
        int mid=0;
    
    while(l<=h)
    {
         mid = (l+h)>>1;
        if(target<nums[mid])
            h=mid-1;
        else if(target>nums[mid])
            l=mid+1;
        else
        {
            return mid;
        }
    }
      if(target<nums[mid])
          return mid;
        else
            return mid+1;
    }
}