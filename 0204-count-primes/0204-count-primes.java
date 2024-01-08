class Solution {
    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];
       if(n>0) prime[0]=true;
       if(n>1) prime[1]=true;
       
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           for(int j=i*i;j<n;j=j+i)
           {
               prime[j]=true;
           }
       }
       int count=0;
       for(boolean i:prime)
       {
           if(i==false)
           count++;
       }
       return count;
    }
}