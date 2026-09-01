class Solution {
    public int subarraySum(int[] nums, int k) {
    // Brute Force
    //  int counter = 0;
    //  for(int i = 0 ; i < nums.length;i++){
    //     //Better 
    //     int sum = 0;
    //     for(int j = i;j<nums.length;j++){
    //         sum += nums[j];
    //         // int sum = 0;
    //         // for(int x = i; x<= j;x++){
    //         //     sum += nums[x];
    //         // }
    //         if(sum == k){
    //             counter++;
    //         }
    //     }
    //  }
    //  return counter;

    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,1);

    int currentSum = 0,count = 0;
    for(int num : nums){
        currentSum += num;

        if(map.containsKey(currentSum-k)){
            count += map.get(currentSum-k);
        }

        map.put(currentSum,map.getOrDefault(currentSum,0)+1);

    }

    return count;

    }
}