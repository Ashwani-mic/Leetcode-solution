class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        HashMap<Character,Integer> map = new HashMap<>();
      
        for(int i = 0;i<n;i++){
            char ch = moves.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int freqU = map.getOrDefault('U',0);
        
        int freqD = map.getOrDefault('D',0);
        int  freqR = map.getOrDefault('R',0);
        int  freqL =  map.getOrDefault('L',0);
        if(freqU ==freqD && freqR ==freqL){
            return true;
        }
        return false;
        
    }
}