class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        return generate(res,new ArrayList<>(),candidates,target,0);
        
        }
    
     public List<List<Integer>> generate(List<List<Integer>> res, List<Integer> ans, int[] candidates, int target,int start)
      {
          
          if(start==candidates.length)
          {
              if(target==0)
               res.add(new ArrayList<>(ans));
               return res;
          }

           if(candidates[start]<=target)
           {
            ans.add(candidates[start]);
            generate(res,ans,candidates,target-candidates[start],start);
            ans.remove(ans.size()-1);
           }
            generate(res,ans,candidates,target,start+1);
          
          return res;
          
          
          
          
          
      }
}