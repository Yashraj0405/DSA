class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numHM = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {          
            numHM.put(nums[i], numHM.getOrDefault(nums[i], 0) + 1); 

            if (numHM.get(nums[i]) > nums.length / 2) {  
                return nums[i];
            }
        }

        return -1; 
    }
}