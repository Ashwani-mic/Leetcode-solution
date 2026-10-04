class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int ans = 0;
        int[] arr = new int[26];
        int maxfreq = 0;
        for(int i = 0;i<s.length();i++){
            int index = s.charAt(i)-'A';
            arr[index]++;
            maxfreq  = Math.max(maxfreq ,arr[index] );
            while((i-left+1) - maxfreq >k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans, i-left+1);

        }
        return ans;
        
    }
}