class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
           for(int j=0;j<nums.length-1-i;j++) 
           {
               if(nums[j]==0)
               {
                   int t=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=t;
               }
           }
        }
        
    }
}