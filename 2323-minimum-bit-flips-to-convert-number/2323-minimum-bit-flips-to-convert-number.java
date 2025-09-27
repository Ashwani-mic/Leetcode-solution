class Solution {
    public int minBitFlips(int start, int goal) {
        int a = (start ^ goal);
        int count=0;
        while(a>0){
            int  n  = (a &1);
            if( n !=0){
                count++;
            }
            a= a>>1;

        }
        return count;
        
    }
}