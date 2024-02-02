class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            int j=i;
            while(j<nums.length)
            {
            sum+=nums[j];
            if(sum==k)
              count++;
            j++;
            }
            sum=0;
        }
       return count; 
    }
}