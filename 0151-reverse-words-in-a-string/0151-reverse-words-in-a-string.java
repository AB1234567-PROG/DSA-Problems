class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder("");
        int j=0;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                if((sb.length()!=0) && j==0)
                {
                  sb.append(' ');
                    j=i;
                  
                }
                
                else if((sb.length()==0) && j==0)
                    j=i;
                    
                else
                    continue;
            }
            
            else if(s.charAt(i)==' ' && j!=0)
            {
                sb.append(s.substring(i+1,j+1));
                j=0;
            }
            
        }
        
        if(j!=0 || (j==0 && s.charAt(0)!=' '))
            sb.append(s.substring(0,j+1));
       return sb.toString(); 
    }
}