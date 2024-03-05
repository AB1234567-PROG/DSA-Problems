class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> res = new ArrayList<>();
        
        String s1 = "";
        //+=s.charAt(0);
        String s2 = s.substring(0);
        
        return generate(res,s1,s2);
        
    }
      List<String> generate(List<String> res, String s1, String s2)
      {
          if(s2.length()==0)
          {
              res.add(s1);
              return res;
          }
          
          char c=s2.charAt(0);
          char c1=s2.charAt(0);
          
          //if(c>='a' && c<='z')
             c=Character.toUpperCase(c);
          //else if(c>='A' && c<='Z')
              c1=Character.toLowerCase(c);
          
          generate(res, s1+c1,s2.substring(1));
          if(!(c>='0' && c<='9'))
          generate(res, s1+c,s2.substring(1));
          
          return res;
              
          
              
              
          
          
      }
       
}