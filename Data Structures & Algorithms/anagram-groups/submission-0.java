class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         HashMap<String,List<String>> mp=new HashMap<>();
         for(String str:strs)
         {
            String frequencyString =getFrequencyString(str);
            if(mp.containsKey(frequencyString))
            mp.get(frequencyString).add(str);
            else
            {
                List<String> strlist=new ArrayList<>();
                strlist.add(str);
                mp.put(frequencyString, strlist);
            }
         }
         return new ArrayList<>(mp.values());
        
    }
    String getFrequencyString(String str){
        int freq[]=new int[26];
        char ch[]=str.toCharArray();
        for(char c:ch)
        freq[c-'a']++;
        StringBuilder st=new StringBuilder("");
        for(int i:freq)
        {  char c='a';
            st.append(c);
            st.append(i);
            c++;
        }
        return st.toString();

    }
}
