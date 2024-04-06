class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashMap<Character,Integer> hm = new HashMap<>();
       int i=0;
       int maxlength=0;

       for(int j=0;j<s.length();j++)
       {
        if(hm.containsKey(s.charAt(j)))
        
            hm.put(s.charAt(j),hm.get(s.charAt(j))+1);
    
        else
        hm.put(s.charAt(j),1);

        while(hm.get(s.charAt(j))>1)
        {
            hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
            i++;
        }
        maxlength=Math.max(maxlength,j-i+1);
       }

       return maxlength;
    }
}