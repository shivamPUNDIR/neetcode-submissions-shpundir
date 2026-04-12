class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyTable = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(frequencyTable.containsKey(ch)){
                frequencyTable.put(ch, frequencyTable.get(ch) + 1);
            }else{
                frequencyTable.put(ch, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!frequencyTable.containsKey(ch)) return false;
            else frequencyTable.put(ch, frequencyTable.get(ch) - 1);
            if(frequencyTable.get(ch) < 0) return false;
        }
        
        return true;
    }
}
