class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        
        while(left <= right){
            if(nums[left] == val){
                // swap with right which could/could not be equal to val
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            }else {
                left++;
            }
        }
        return right + 1;
    }
}