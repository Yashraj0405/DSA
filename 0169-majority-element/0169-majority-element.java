class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0 ,elementCount = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(count == 0){
                element = nums[i];
            }

            if(nums[i] == element){
                count++;
            }
            else count--;
        }

        for(int num : nums){
            if(num == element){
                elementCount++;
            }
        }

        if(elementCount > nums.length/2) return element;
        return -1;
    }
}