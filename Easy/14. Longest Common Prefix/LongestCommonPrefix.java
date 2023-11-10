class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int length = strs[0].length();

        // Find lowest length
        for(int l = 0; l < strs.length; l++) {
            if(strs[l].length() < length) {
                length = strs[l].length();
            }
        }

        for(int i = 0; i < length; i++) {
            int count = 0;
            int j = 0;
            while(j < strs.length) {
                if(strs[j].substring(0,length-i).equals((strs[0].substring(0,length-i)))) {
                    count += 1;
                }
                j += 1;
            }
            if(count == strs.length) {
                prefix = strs[0].substring(0,length-i);
                break;
            }
        }
        return prefix;
    }
}
