class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)return false;
        boolean lower  = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        String s = "!@#$%^&*()-+";
        for(int i =0;i<password.length();i++){
            char ch = password.charAt(i);
            if(ch>='a' && ch<='z'){
                lower = true;
            }
            if(ch>='A' && ch<='Z'){
                upper = true;
            }
            if(ch >='0' && ch<='9'){
                digit = true;
            }
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(ch == c){
                    special = true;
                    break;
                }
            }
            if(i>0 && ch == password.charAt(i-1)){
                return false;
            }
        }
        return lower && upper && digit && special;
        
    }
}