class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numHM = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; i++){
            int req = target - nums[i];
            if(numHM.containsKey(req)){
                return new int[]{i,numHM.get(req)};
            }else{
                numHM.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}