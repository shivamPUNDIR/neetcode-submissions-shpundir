class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // Arrays.sort, then probe the element at index n//2
            // Arrays.sort(nums);
            // return nums[n/2];
        int curr = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0) curr = nums[i];
            if(nums[i] == curr){
                count++;
            }else{
                count--;
            }
        }
        return curr;
    }
}