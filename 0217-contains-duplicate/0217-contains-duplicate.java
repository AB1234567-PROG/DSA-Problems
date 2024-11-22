class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> s1 = new HashSet<Integer>();
        for(Integer i: nums)
        {
            if(s1.contains(i))
                return true;
            s1.add(i);
                
        }
        
        return false;
        
    }
}