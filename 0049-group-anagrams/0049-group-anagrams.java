class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0 ;i<strs.length;i++){
            String st = strs[i];

            char[] s = st.toCharArray();
            Arrays.sort(s);
            String key = new String(s);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values())
;        
    }
}