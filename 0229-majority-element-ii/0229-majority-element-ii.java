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
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            // Add to result only when the count just reaches mini
            if (mpp.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            if (result.size() == 2) break;
        }

        return result;

    }
}