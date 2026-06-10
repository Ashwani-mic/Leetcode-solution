class Solution {
    public boolean validPalindrome(String s) {
        int  n = s.length();
        char[] arr = s.toCharArray();
        int left = 0 ;
        int right = n-1;
        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }
            else{
                return isPalindrom(arr,left+1,right) || isPalindrom(arr,left,right-1);
            }
           
        }
        return true;
        
        
    }
    public boolean  isPalindrom(char[] arr , int left , int right){
        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            else {
                left++;
                right--;
            }


        }
        return true;
    }
}