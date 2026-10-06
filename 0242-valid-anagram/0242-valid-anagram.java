class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        int[] fre = new int[26];
        int[] freq = new int[26];
        for(int i =0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            freq[t.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(fre[i] !=freq[i]){
                return false;
            }
        }
        return true;
        
    }
}