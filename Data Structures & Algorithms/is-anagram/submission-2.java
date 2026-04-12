class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabet[] = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            alphabet[ch - 97]++;
            alphabet[c - 97]--;
        }

        for(int i = 0; i < 26; i++){
            if(alphabet[i] != 0) return false;
        }
        
        return true;
    }
}
