class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int times = nums.length / 3;
        Map<Integer, Integer> freq = new HashMap<>();
        Set<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                int num = freq.get(nums[i]) + 1;
                freq.put(nums[i], num);
                if(num > times) ans.add(nums[i]);
            }else {
                freq.put(nums[i], 1);
                if(1 > times) ans.add(nums[i]);
            }
        }

        
        return new ArrayList<>(ans);
    }
}