class Solution {
    public String longestCommonPrefix(String[] strs) {

        int index = 0;
        
        while(true){
            char currChar;
            if(strs[0].length() > index){
                currChar = strs[0].charAt(index);
            }else break;
            for(int i = 1; i < strs.length; i++) {
                int length = strs[i].length();
                if(index >= length || currChar != strs[i].charAt(index)) return strs[0].substring(0, index);
            }
            index++;
        }
        return strs[0];
    }
}