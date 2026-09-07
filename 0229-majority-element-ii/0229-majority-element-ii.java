class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Brute
        // List<Integer> result = new ArrayList<>();

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(result.size() == 0 || nums[i] != result.get(0) && (result.size() < 2 || nums[i] != result.get(1))){
        //         int count = 0;
        //         for(int j = 0 ; j < nums.length ; j++){
        //             if(nums[i] == nums[j]) count++;
        //         }
        //         if(count > nums.length / 3) result.add(nums[i]);
        //     }
        //       if(result.size() == 2) break;
        // }

        // return result;


        //Better
        // int n = nums.length;
        // List<Integer> result = new ArrayList<>();
        // Map<Integer, Integer> mpp = new HashMap<>();
        // int mini = n / 3 + 1;

        // for (int i = 0; i < n; i++) {
        //     mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

        //     // Add to result only when the count just reaches mini
        //     if (mpp.get(nums[i]) == mini) {
        //         result.add(nums[i]);
        //     }

        //     if (result.size() == 2) break;
        // }

        // return result;

        //Optimal
        List<Integer> result = new ArrayList<>();
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE , count1 = 0, count2 = 0,
        maxCount1 = 0 , maxCount2 = 0 , mini = nums.length/3 +1 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(count1 == 0 && nums[i] != element2){
                element1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0 && nums[i] != element1){
                element2 = nums[i];
                count2 = 1;
            }
            else if(element1 == nums[i]) count1++;
            else if(element2 == nums[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }

        for(int num : nums){
            if(element1 == num) maxCount1++;
            if(element2 == num) maxCount2++;
        }

        if(maxCount1  >= mini) result.add(element1);
        if(maxCount2  >= mini && element1 != element2) result.add(element2);

        return result;
    }
}