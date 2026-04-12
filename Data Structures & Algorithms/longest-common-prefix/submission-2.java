class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        
        String lcp = "";
        int index = 0;
        
        while(index < strs[0].length()){
            char currChar = strs[0].charAt(index);
            for(int i = 1; i < strs.length; i++) {
                int length = strs[i].length();
                if(index >= length) return lcp;
                if(currChar != strs[i].charAt(index)) return lcp;
            }
            index++;
            lcp+=currChar;
        }
        return lcp;
    }
}