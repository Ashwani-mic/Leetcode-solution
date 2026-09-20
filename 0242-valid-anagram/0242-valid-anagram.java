class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())return false;
        int[] st = new int[256];
        for(int i = 0;i<s.length();i++){
            st[s.charAt(i)-'a']++;
            st[t.charAt(i)-'a']--;
        }
        for(int p:st){
            if(p !=0){
                return false;
            }
        }
        return true;

        
    }
}