class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if(str.substring(0,1).equals("-")) {
            return false;
        }
        else {
            int j = str.length();
            for(int i = 0; i < str.length()/2; i++) {
                if(!(str.substring(i,i+1).equals(str.substring(j-1,j)))) {
                    return false;
                }
                j -= 1;
            }
        }
        return true;
    }
}
