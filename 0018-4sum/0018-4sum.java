class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> l2= new ArrayList<List<Integer>>();
        
       
        Arrays.sort(nums);
            
            for(int i=0; i<nums.length; i++)
            {
                if(i!=0 && nums[i]==nums[i-1])
                    continue;
                for(int j=i+1; j<nums.length; j++)
                {
                   if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                    int k=j+1;
                    int l=nums.length-1;
                    while(k<l)
                    {
                        long sum=nums[i];
                        sum+=nums[j];
                        sum+=nums[k];
                        sum+=nums[l];
                        if(sum==target)
                        {
                            
                            List<Integer> l1 = new ArrayList<Integer>();
                              l1.add(nums[i]);
                              l1.add(nums[j]);
                              l1.add(nums[k]);
                              l1.add(nums[l]);
                              l2.add(l1);
                              k++;
                              l--;
                            
                            while(k<l && nums[k]==nums[k-1]) 
                            { k++;}
                            while(k<l && nums[l]==nums[l+1])
                            {l--;}
                        }
                        
                        else if(nums[i]+nums[j]+nums[k]+nums[l]<target)
                        {
                            k++;
                        }
                        else
                            l--;
                        
                    }
                }
            }
        
       return l2;
       
    }
}