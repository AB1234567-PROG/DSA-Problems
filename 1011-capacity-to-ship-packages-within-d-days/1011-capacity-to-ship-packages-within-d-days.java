class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int sum=0,big=weights[0];

     for(int i:weights)   
       {
           sum+=i;
           big=Math.max(big,i);
       } 

       int l=big,h=sum;

       while(l<=h)
       {
           int mid=(l+h)>>1;

           int rd=pd(weights,mid);
           if(rd<=days)
           h=mid-1;
           else
           l=mid+1;
       }

      return l;
    }

    int pd(int[] weights, int mid)
    {
        int load=0;
        int day=1;

        for(int i:weights) 
        {
            load+=i;

        if(load>mid)
        {
            load=i;
            day++;
    
        }

        else
        {
            continue;

        }
    }
    

    return day;
}}