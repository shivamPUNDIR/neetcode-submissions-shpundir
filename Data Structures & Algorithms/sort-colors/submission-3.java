class Solution {
    // public void sortColors(int[] nums) {
    //     // send all o to teh start of array while blue to the end of array
    //     // white will automatically be left in the middle
    //     // keep two pointers to track the red and blue partition
    //     // a single runner variable to iterate the array
    //     // runner var should not surpass right
    //     if(nums.length == 1) return;

    //     int left = -1;
    //     int right = nums.length;
    //     int runner = 0;

    //     while(runner < right){
    //         if(nums[runner] == 0){
    //             nums[runner] = nums[++left];
    //             nums[left] = 0;
    //             runner++;
    //         } else if(nums[runner] == 2){
    //             // swap with the right
    //             nums[runner] = nums[--right];
    //             nums[right] = 2;
    //         } else{
    //             runner++;
    //         }
    //     }
    // }
    // Count all the number of 1, or 2s or 3s in the array nums and store the frequency in color array
    // modify the nums array and overwrite 0s, 1s and 2s in the nums array corresponding the times in the frequency table.
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int i = 0; i < nums.length; i++) {
            int currentIndex = nums[i];
            colors[currentIndex] += 1;
         }

            int writeIndex = 0;
         for (int i = 0; i < colors.length; i++) {
            int count = 0;
            while (count < colors[i]) {
                nums[writeIndex] = i;
                writeIndex++;
                count++;
            }
         }
    }
}
