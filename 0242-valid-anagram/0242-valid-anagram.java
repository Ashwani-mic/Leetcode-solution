class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[256];
        if(s.length()!=t.length()) return false;
         
        int j = 0 ; 
        for(int i = 0 ; i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(j)-'a']--;
            j++;
        }
        for(int i = 0 ; i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        
        
    }
}