class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Integer.MIN_VALUE , right = 0 ;
        for(int num : nums){
            left = Math.max(left,num);
            right += num;
        }

        while(left <= right){
            int mid = (left + right) / 2;
            if(canSplit(nums,mid,k)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int mid, int k){
        int subArray = 1, currentSum = 0;

        for(int num : nums){
            if(currentSum + num > mid){
                currentSum = num;
                subArray++;
                if(subArray > k) return false;
            }else{
                currentSum += num;
            }
        }
        return true;
    }
}