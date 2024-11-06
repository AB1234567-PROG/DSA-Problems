class Solution {
    public int fib(int n) {
        
        
        int i=n;
        
        if(i<=1)
        return i;
            
        int sum=fib(i-1)+fib(i-2);
        return sum;
        
    }
}