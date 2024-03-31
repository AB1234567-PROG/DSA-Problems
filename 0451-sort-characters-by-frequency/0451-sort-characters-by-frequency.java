class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        
        List<Character> chars = new ArrayList<>(hm.keySet());
        Collections.sort(chars, (a,b) -> hm.get(b)-hm.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c:chars)
        {
            for(int i=0; i<hm.get(c);i++)
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}