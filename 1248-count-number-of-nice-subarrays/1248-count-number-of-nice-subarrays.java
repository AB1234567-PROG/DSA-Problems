class Solution {
 
    int atmost(int[] nums, int k)
    {
    int start=0;
    int res=0;
    int count=0;

    for(int end=0;end<nums.length;end++)
    {
        if(nums[end]%2==1)
        count++;
        while(count>k)
        {
            if(nums[start]%2==1)
            count--;
            start++;
            
        }

        res+=end-start+1;
        
    }
      return res;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        
       int i = atmost(nums,k);
       int j  = atmost(nums,k-1);
       return i-j;
    }
}