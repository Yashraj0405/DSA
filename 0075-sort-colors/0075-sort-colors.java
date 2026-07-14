class Solution {
    public void sortColors(int[] nums) {
       int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);          // send 0 to left region
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;                         // 1 is already in place
            } else {
                swap(nums, mid, high);         // send 2 to right region
                high--;                        // don't advance mid!
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}