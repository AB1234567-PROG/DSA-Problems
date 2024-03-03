class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        return generate(res, new ArrayList<>(), nums,0);
            
            
        
        }
    
    public List<List<Integer>> generate(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums, int start)
    {
        if(res.contains(temp))
        return res;
        
        res.add(new ArrayList<>(temp));
        
        for(int i=start;i<nums.length; i++) 
        {
          temp.add(nums[i]);
          generate(res,temp,nums,i+1);
          temp.remove(temp.size()-1);
        }
        return res;
        }
    }
