class Solution {
    public void sortColors(int[] nums) {
        
        int a=0,b=0,c=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
               a++;

            else if(nums[i]==1)
              b++;
            
            else
                c++;
        }
        int i=0,j=0,k=0;
        while(i<a)
        {
            nums[i]=0;
            j=i+1;
            i=j;
        }
        while(j-i<b)
        {
            nums[j]=1;
            k=j+1;
            j=k;
        }
        if(b==0 && c>=1)
        k=j;
        while(k-j<c && k-j>=0)
        {
            nums[k]=2;
            k++;
        }
    }
}