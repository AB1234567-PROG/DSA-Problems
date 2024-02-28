class Solution {
    
    int i=1, j=1;
    int res=0;
    
    public int kthGrammar(int n, int k) {
        
    int no = (int)Math.pow(2,n-1);
    int mid=no/2;
     
        if(n==1 && k==1)
            return 0;
        if(k<=mid)
           return kthGrammar(n-1,k);
        
        else
           return kthGrammar(n-1,k-mid)==0?1:0;
    }
}