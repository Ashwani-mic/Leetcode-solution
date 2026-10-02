class Solution {
    public boolean isVowel(char s){
        return s =='a' || s== 'e'|| s== 'i' || s == 'o' || s=='u';

    }
    public int maxVowels(String s, int k) {
        int left = 0;
        int ans = 0;
         int count = 0;
        
        for(int i =0;i<s.length();i++){
           
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(i-left+1 == k){
                ans = Math.max(count,ans);
                if(isVowel(s.charAt(left))){
                count--;
            }
            left++;
            
            }
           

            
        }
        return ans;
        
    }
}