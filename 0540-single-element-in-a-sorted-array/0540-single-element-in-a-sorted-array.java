class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l=0,h=nums.length-1;
        
        if(nums.length==1)
            return nums[0];
        
        while(l<=h)
        {
            int mid=(l+h)>>1;
            
            if(mid!=0 && mid!=nums.length-1 && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] || (mid==0 && nums[mid]!=nums[mid+1]) || (mid==nums.length-1 && nums[mid]!=nums[mid-1]) )
                return nums[mid];            
                
            else if((mid!=0 && mid%2==0 && nums[mid-1]==nums[mid]) || (mid!=0 && mid%2==1 && nums[mid-1]!=nums[mid]))
                h=mid-1;
            else
                l=mid+1;
        }
       return 0; 
    }
}