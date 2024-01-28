class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        Set<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        
        int lastEle=0;
        int count=0;
        int maxi=1;
        
        for(Integer i:hs)
        {

            if(hs.contains(i-1))
            {
                continue;
            }
            
            else
            {
                count++;
                lastEle=i;
                while(hs.contains(i+1))
                {
                    count++;
                    i++;
                }
                maxi=Math.max(count,maxi);
                count=0;
                i=lastEle;
            }
        }
        
          
        return maxi;
    
        
        
    }
}