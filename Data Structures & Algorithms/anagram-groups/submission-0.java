class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for(var s : strs){
            List<Integer> anagramList = getAnagramList(s);
            if(map.containsKey(anagramList)){
                map.get(anagramList).add(s);
            }else {
                map.put(anagramList, new ArrayList<>(){{add(s);}});
            }
        }
        return new ArrayList<>(map.values());
    }

    private List<Integer> getAnagramList(String s){
        int[] charFrequency = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            charFrequency[ch - 97]++;
        }
        List<Integer> frequencyList = new ArrayList<>();
        for (int count : charFrequency) {
            frequencyList.add(count);
        }
        return frequencyList;
    }
}
