class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String res=strs[0];
        
        for(int i=1;i<strs.length;i++)
        {
            int count=0;
            int j=Math.min(res.length(),strs[i].length());
            for(int k=0;k<j;k++)
            {
                if(res.charAt(k)==strs[i].charAt(k))
                    count++;
                else
                    break;
            }
            res=res.substring(0,count);
        }
        
        return res;
        
    }
}