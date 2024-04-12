class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int count=0,sum=0,start=0,end=0;
        
          while(count<k) 
          {
            sum+=cardPoints[end];
            count++;
            end++;
          }
          end--;
          int max=sum;
          while(end!=cardPoints.length-1)
          {
            start--;
            if(start==-1)
             start=cardPoints.length-1;
             sum+=cardPoints[start]-cardPoints[end];
             max=Math.max(max,sum);
             end--;
             if(end==-1)
             end=cardPoints.length-1;
          }
        
      return max;  
    }
}