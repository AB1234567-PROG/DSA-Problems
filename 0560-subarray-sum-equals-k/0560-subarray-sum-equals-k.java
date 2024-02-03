class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int presum=0,count=0;
        
        hm.put(presum,1);
        
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];
            
            if(hm.containsKey(presum-k))
            {
                count+=hm.get(presum-k);
               
            }
            
            if(hm.containsKey(presum))
                hm.put(presum,hm.get(presum)+1);
            else
                hm.put(presum,1);
                 
            
        }
        return count;
    }
}