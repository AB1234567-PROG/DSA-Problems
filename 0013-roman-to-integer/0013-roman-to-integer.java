class Solution {
    
    int prec(char c)
    {
        if(c=='M')
         return 1000;
        else if(c=='D')
         return 500;
        else if(c=='C')
            return 100;
        else if(c=='L')
           return 50; 
        else if(c=='X')
            return 10;
        else if(c=='V')
            return 5;
        else if(c=='I')
            return 1;
        else
             return -1;
    }
    
    
    public int romanToInt(String s) {
        
        int sum=0;
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(prec(s.charAt(i))>=prec(s.charAt(i+1)))
               sum+=prec(s.charAt(i));
            else
               sum-=prec(s.charAt(i));
        }
               sum+=prec(s.charAt(s.length()-1));
               return sum;
        
    }
}