class Solution {
    public void nextPermutation(int[] nums) {
        
       int n = nums.length;
        
        if(n==1)
            return;
        
        int peak=-1;
            
            for(int i=1;i<n;i++)
            {
                if(nums[i]>nums[i-1])
                {
                    peak=i;
                }
            }
        
        if(peak==-1)
        {
            for(int i=0;i<n/2;i++)
            {
                int t = nums[i];
                nums[i]=nums[n-1-i];
                nums[n-1-i]=t;
            }
            return;
        }
        
        int peakval=nums[peak];
        int j=peak;
        
        for(int k=peak;k<n;k++)
        {
            if(nums[k]>nums[peak-1] && nums[k]<nums[j])
                j=k;
        }
            int t = nums[peak-1];
                nums[peak-1]=nums[j];
                nums[j]=t;
        Arrays.sort(nums,peak,n);
    }
}