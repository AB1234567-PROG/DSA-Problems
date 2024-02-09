class Solution {
    public int findMin(int[] nums) {

        int l=0,h=nums.length-1;

        while(l<=h)
        {
            int mid=(l+h)>>1;
             
            if(mid!=0 && nums[mid-1]>nums[mid]) 
               return nums[mid];
            else if(nums[l]>nums[mid])
            h=mid-1;
            else if(nums[mid]>nums[h])
            l=mid+1;
            else
            return nums[l];
        }

        return 0;
        
    }
}