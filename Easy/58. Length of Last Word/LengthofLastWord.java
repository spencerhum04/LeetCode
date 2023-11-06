class Solution {
    public int lengthOfLastWord(String s) {
        int lastIndex = 0;
        int afterWord = 0;
        for(int j = s.length(); j > 0; j--) {
            if(!(s.substring(j-1,j).equals(" "))) {
                afterWord = j;
                break;
            }
            else {
                afterWord = s.length();
            }
        }
        for(int i = 0; i < afterWord; i++) {
            if(s.substring(i,i+1).equals(" ")) {
                lastIndex = i+1;
            }
        }
        return afterWord - lastIndex;
    }
}
