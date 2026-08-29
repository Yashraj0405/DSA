class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot =  -1;

        // Step 1: find rightmost pivot where nums[i] < nums[i+1]
        for(int i = n - 2 ; i >=0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot, array is fully descending → reverse all
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find rightmost element greater than nums[pivot]
        for(int j = n -1 ; j > pivot ; j--){
            if(nums[j]>nums[pivot]){
                swap(nums, pivot, j);
                break;
            }
        }

        // Step 5: reverse suffix after pivot
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left , int right){
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}