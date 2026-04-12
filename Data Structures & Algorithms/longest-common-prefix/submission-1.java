class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";

        int index = 0;
        
        while(true){
            char currChar;
            if(index >= strs[0].length()) return lcp;
            else currChar = strs[0].charAt(index);
            for(int i = 0; i < strs.length; i++) {
                int length = strs[i].length();
                if(index >= length) return lcp;
                if(currChar != strs[i].charAt(index)) return lcp;
            }
            index++;
            lcp+=currChar;
        }
    }
}