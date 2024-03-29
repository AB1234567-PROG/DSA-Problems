class Solution {
    public int myAtoi(String s) {
        
        char sign = ' ';
        double sum=0;
        int count=0;
        boolean flag = false;
       for(int i=0; i<s.length();i++)
       {
           if(count>1)
           return (int)sum;
           else if(s.charAt(i)>='0' && s.charAt(i)<='9'&& flag==false)
              sum=sum*10+s.charAt(i)-'0';
           else if(i!=s.length()-1 && (s.charAt(i)=='+' || s.charAt(i)=='-'))
             {  
                if(i!=0 && s.charAt(i-1)>='0' && s.charAt(i-1)<='9')
                flag=true;
                else
                {
                sign=s.charAt(i);
                count++;
                }
             }
                 
           else if(s.charAt(i)==' ')
           {
            if(i!=0 && ((s.charAt(i-1)>='0' && s.charAt(i-1)<='9')|| s.charAt(i-1)=='+' || s.charAt(i-1)=='-'))
            flag=true;
            else
            continue;
           }
         
           else
           flag=true; 
       }
        if(sign=='-')
            sum=0-sum;
        if(sum>=Math.pow(2,31))
            sum=Math.pow(2,31)-1;
        else if(sum<Math.pow(-2,31))
            sum=Math.pow(-2,31);
        return (int)sum;
    }
}