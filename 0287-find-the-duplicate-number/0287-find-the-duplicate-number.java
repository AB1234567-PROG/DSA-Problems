class Solution {
    public int findDuplicate(int[] nums) {

        int sum=0;
        int[] res=new int[nums.length];
        int j=0;

        for(int i=0;i<nums.length;i++)
        {
            j=nums[i];
            res[j]++;
        }
        
        for(int i=1;i<res.length;i++)
        {
            if(res[i]>1)
            return i;
        }
      
        return j; 
        
    }
}