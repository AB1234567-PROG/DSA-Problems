class Solution {
    public int addDigits(int num) {
        int sum=0;

        while(num>0 || sum>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;

            if(num==0 && sum>=10)
            {num=sum;
            sum=0;}

            else if(num>0)
            continue;
            else
            break;
        }
        return sum;
        
    }
}