class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
       return generate(res, new ArrayList<>(), nums, 0);
       
     }
    
    public List<List<Integer>> generate(List<List<Integer>> res, List<Integer> tempSet, int[] nums, int start)
    {
        
        res.add(new ArrayList<>(tempSet));
        for(int i = start; i<nums.length; i++)
        {
            tempSet.add(nums[i]);
            
            generate(res, tempSet, nums, i+1);
            
            tempSet.remove(tempSet.size()-1);
        }
        return res;
    }
    
}