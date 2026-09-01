class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Better
        // Set<List<Integer>> result = new HashSet<>();

        // for(int i = 0 ; i < nums.length ; i++){
        //     Set<Integer> hashSet = new HashSet<>();
        //     for(int j = i + 1 ; j < nums.length ; j++){
        //         int third = -(nums[i]+nums[j]);

        //         if(hashSet.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(temp);
        //             result.add(temp);
        //         }
        //         hashSet.add(nums[j]);
        //     }
        // }

        // return new ArrayList<>(result);

        //Optimal
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
                if(i > 0 && nums[i] == nums[i -1]) continue;

                int left = i + 1 , right = nums.length - 1;
                while(left<right){
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0){
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;

                        while(left<right && nums[left-1] == nums[left]) left++;
                        while(left<right && nums[right+1] == nums[right]) right--;
                    }
                    else if(sum < 0) left++;
                    else right--;
                }
        }

        return ans;

    }
}