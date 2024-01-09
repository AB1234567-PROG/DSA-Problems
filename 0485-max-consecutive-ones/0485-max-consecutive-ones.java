class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int sum =0;
        int max=0;
        for(int i:nums)
        {
            if(i==1)
                sum+=i;
            else
            { if(max<sum)
                max=sum;
                sum=0;
            }
        }
        if(max<sum)
          max=sum;
        return max;
        
    }
}