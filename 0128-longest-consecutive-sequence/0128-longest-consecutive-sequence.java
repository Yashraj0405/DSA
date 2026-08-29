class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return  0;
        // Arrays.sort(nums);
        // int lastSmall = Integer.MIN_VALUE, n = nums.length , count = 0, longest = 1;

        // for(int i = 0 ; i < n; i++){
        //     if(nums[i] - 1 == lastSmall){
        //         count += 1;
        //         lastSmall = nums[i];
        //     }
        //     else if(lastSmall != nums[i]){
        //         count = 1;
        //         lastSmall = nums[i];
        //     }
        //     longest = Math.max(longest,count);
        // }
        // return longest;

         // Get the length of the array
        int n = nums.length;

        // If the array is empty, no sequence exists
        if (n == 0) return 0;

        // Variable to store the longest sequence length found
        int longest = 1; 

        // HashSet to store unique elements for O(1) lookup
        Set<Integer> st = new HashSet<>();

        // Add all elements to the set to remove duplicates
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        for (int it : st) {
            // If there is no number before 'it', it’s the start of a sequence
            if (!st.contains(it - 1)) {
                // Start the count for this sequence
                int cnt = 1; 
                // Store the current number
                int x = it; 

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {
                    // Move to the next number in sequence
                    x = x + 1; 
                    // Increment the length of current sequence
                    cnt = cnt + 1; 
                }

                // Update the longest sequence length if needed
                longest = Math.max(longest, cnt);
            }
        }

        // Return the length of the longest sequence
        return longest;
    }
}