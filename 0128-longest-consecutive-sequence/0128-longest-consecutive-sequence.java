class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return  0;
        Arrays.sort(nums);
        int lastSmall = Integer.MIN_VALUE, n = nums.length , count = 0, longest = 1;

        for(int i = 0 ; i < n; i++){
            if(nums[i] - 1 == lastSmall){
                count += 1;
                lastSmall = nums[i];
            }
            else if(lastSmall != nums[i]){
                count = 1;
                lastSmall = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}