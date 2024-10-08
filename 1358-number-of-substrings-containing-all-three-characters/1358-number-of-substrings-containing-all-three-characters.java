class Solution {
    public int numberOfSubstrings(String s) {

        char[] abc = new char[3];
        int start=0;
        int res=0;

        for(int end=0; end<s.length(); end++)
        {
            abc[s.charAt(end)-'a']++;
            while(abc[0]>=1 && abc[1]>=1 && abc[2]>=1)
            {
                res+=s.length()-end;
                abc[s.charAt(start++)-'a']--;
            }
        }
        return res;
    }
}