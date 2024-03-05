class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        String s = "";
        int open=n, close=n;
        
        return generate(res,s,open,close);
        
    }
    
    List<String> generate(List<String> res, String s, int open, int close)
    {
        if(open==0 && close==0)
        {
            res.add(s);
            return res;
        }
        
        if(open==close)
            generate(res,s+'(',open-1,close);
        else if(open==0)
            generate(res,s+')',open,close-1);
        else
        {
            generate(res,s+'(',open-1,close);
            generate(res,s+')',open,close-1);
        }
        
        return res;
        
        
    }
}