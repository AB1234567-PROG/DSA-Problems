class Solution {

    public int atmost(int[] nums, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int start=0,res=0;

        for(int end=0; end<nums.length;end++)
        {
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);

                while(hm.size()>k)
                {
                  hm.put(nums[start],hm.get(nums[start])-1);
                  if(hm.get(nums[start])==0)
                  hm.remove(nums[start]);
                  start++; 
                }
               res+=end-start+1; 
            }
            
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return atmost(nums, k)-atmost(nums, k-1);
    }

}