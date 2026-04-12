class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // Arrays.sort, then probe the element at index n//2

        Arrays.sort(nums);
        return nums[n/2];
    }
}