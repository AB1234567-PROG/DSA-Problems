class Solution {
    public int maxProfit(int[] prices) {
        
        int[] aux = new int[prices.length];
        int maxi=prices[prices.length-1];
        int profit=0;
        
        for(int i=prices.length-1;i>=0;i--)
        {
            aux[i]=Math.max(maxi,prices[i]); 
            maxi=aux[i];
        }
        maxi=0;
        int diff=0;
        for(int i=0;i<prices.length;i++)
        {
            diff=aux[i]-prices[i];
            if(maxi<diff)
              maxi=diff;  
        }
        return maxi;
        
    }
}