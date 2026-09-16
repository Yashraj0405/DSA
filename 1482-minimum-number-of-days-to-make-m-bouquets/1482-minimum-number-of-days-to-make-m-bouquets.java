class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m * k > bloomDay.length) return -1;
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // Find the minimum and maximum bloom day
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        // Binary search between minDay and maxDay
        int left = minDay, right = maxDay, day = -1;

        while(left <= right){
            int mid = (left + right)/2;
            if(possible(bloomDay,mid,m,k) ){
                day = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return day;
    }

    private boolean possible(int[] bloomDay, int mid , int m, int k){
        int count = 0 , bCount = 0;
        for(int day : bloomDay){
            if(day <= mid){
                count++;
            }else{
                bCount += count/k;
                count = 0;
            }
        }
        bCount += count/k; 
        return bCount >= m;
    }
}