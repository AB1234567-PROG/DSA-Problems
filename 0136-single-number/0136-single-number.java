class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        
        List<Integer> l1=new ArrayList<Integer>();
        
        for(int i:nums)
        {
            if(l1.contains(i))
               sum-=i; 
            else{
                sum+=i;
                l1.add(i);
        }}

        return sum;
    }
}