class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder("");
        
       int count=0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                if(count>0)
                    sb.append(s.charAt(i));
                count++;
                    
            }
            else
            {
                if(count>1)
                   sb.append(s.charAt(i));
                count--;
                    
            }
            
        }
       return sb.toString(); 
    }
}