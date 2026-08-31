class Solution {
    public int subarraySum(int[] nums, int k) {
    // Brute Force
     int counter = 0;
     for(int i = 0 ; i < nums.length;i++){
        //Better 
        int sum = 0;
        for(int j = i;j<nums.length;j++){
            sum += nums[j];
            // int sum = 0;
            // for(int x = i; x<= j;x++){
            //     sum += nums[x];
            // }
            if(sum == k){
                counter++;
            }
        }
     }
     return counter;
    }
}