class Solution {
    public String removeOuterParentheses(String s) {
      
        int count=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' && count==0)
                count++;
            else if(s.charAt(i)=='(')
            {    
                  res+='(';
                  count++;
            }
            else if(s.charAt(i)==')' && count!=1)
            {
                
                   res+=')'; 
                   count--;

            }
            else
            count--;    
        }
        
        return res;
    }
}