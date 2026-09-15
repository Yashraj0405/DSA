class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 , right = Arrays.stream(nums).max().getAsInt(),min = Integer.MAX_VALUE;
        while(left <= right){
            int mid = (left + right) / 2;
            if(calculateDivisor(nums,mid,threshold)){
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }

        return left;
    }

    private boolean calculateDivisor(int[] nums, int m, int k){
        int ans = 0;
        for(int num : nums){
            ans += (num + m - 1) / m;
        }
        return ans <= k;
    }
}