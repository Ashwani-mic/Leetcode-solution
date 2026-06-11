class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char colstart = s.charAt(0);
        char colend = s.charAt(3);
        char rowstart = s.charAt(1);
        char rowend = s.charAt(4);
        for(char i = colstart;i<=colend;i++){
            for(char j = rowstart;j<=rowend;j++){
                result.add("" + i+j);

            }
        }
        return result;
        
        
    }
}