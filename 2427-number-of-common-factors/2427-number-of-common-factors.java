class Solution {
    public int commonFactors(int a, int b) {
        
        int c=Math.min(a,b);
        int count=1;
        for(int i=2;i<=c;i++)
        {
            if(a%i==0 && b%i==0)
            count++;
        }
        return count;
    }
}