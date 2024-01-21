class Solution {
    public int majorityElement(int[] nums) 
    {
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        int major=0;
        
        if(nums.length==1)
            major=nums[0];
        
        else
        {
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                if(hm.get(nums[i])>nums.length/2)
                {
                    major=nums[i];
                    break;
                }
            }
            else
                hm.put(nums[i],1);
        }}
        return major;
    }
}