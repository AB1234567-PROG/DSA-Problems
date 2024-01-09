class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            
            int k=target-nums[i];
            if(hm.containsKey(k))
            {
                 res[0]=hm.get(k);
                 res[1]=i;
                 break;
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}