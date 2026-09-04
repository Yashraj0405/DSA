class Solution {
    public int[][] merge(int[][] intervals) {
        //Brute 
        // if (intervals.length <= 1) return intervals;

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // List<int[]> result = new ArrayList<>();

        // int i = 0, n = intervals.length;   
        // while (i < n) {
        //     int start = intervals[i][0], end = intervals[i][1];

        //     int j = i + 1;
        //     while (j < n && intervals[j][0] <= end) {
        //         end = Math.max(end, intervals[j][1]);
        //         j++;
        //     }

        //     result.add(new int[]{start, end});
        //     i = j;
        // }

        // return result.toArray(new int[result.size()][]);

        //Optimal
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        for(int i = 1 ; i < intervals.length ; i++ ){
            int[] next = intervals[i];

            if(next[0] <= current[1]){
                current[1] = Math.max(current[1],next[1]);
            }else{
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}