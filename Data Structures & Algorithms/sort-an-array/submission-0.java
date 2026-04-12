class Solution {

    public int[] sortArray(int[] nums) {
        // quicksort
        if(nums.length == 0 || nums.length == 1) return nums;
        quicksort(0, nums.length - 1, nums);
        return nums;
    }

    private void quicksort(int left, int right, int[] nums){
        // base case
        if(left >= right) return;
        // pivot is always right most element
        int pivot = partition(left, right, nums);
        quicksort(left, pivot - 1, nums);
        quicksort(pivot + 1, right, nums);
    }

    private int partition(int left, int right, int[] nums){
        int pivot = nums[right];
        int partitionIndex = -1;
        int curr = 0;
        
        while(curr <= right){
            if(nums[curr] <= pivot){
                int temp = nums[curr];
                nums[curr] = nums[++partitionIndex];
                nums[partitionIndex] = temp;
            } 
            curr++;
        }


        return partitionIndex;
    }
}