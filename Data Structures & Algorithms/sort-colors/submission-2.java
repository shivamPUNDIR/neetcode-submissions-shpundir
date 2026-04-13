class Solution {
    public void sortColors(int[] nums) {
        // send all o to teh start of array while blue to the end of array
        // white will automatically be left in the middle
        // keep two pointers to track the red and blue partition
        // a single runner variable to iterate the array
        // runner var should not surpass right
        if(nums.length == 1) return;

        int left = -1;
        int right = nums.length;
        int runner = 0;

        while(runner < right){
            if(nums[runner] == 0){
                nums[runner] = nums[++left];
                nums[left] = 0;
                runner++;
            } else if(nums[runner] == 2){
                // swap with the right
                nums[runner] = nums[--right];
                nums[right] = 2;
            } else{
                runner++;
            }
        }
    }
}