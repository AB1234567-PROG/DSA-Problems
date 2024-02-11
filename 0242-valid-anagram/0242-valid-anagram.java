class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
       if(s.length()==t.length())
       {
        for(int i=0; i<s.length();i++)
        {
           if(hm.containsKey(s.charAt(i))) 
               hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        
        for(int i=0; i<t.length();i++)
        {
            if(hm.containsKey(t.charAt(i)))
            {
                if(hm.get(t.charAt(i))==0)
                    return false;
                else
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            }
            else
                return false;
        }
     return true;
       }
        
        else
            return false;
    }
}