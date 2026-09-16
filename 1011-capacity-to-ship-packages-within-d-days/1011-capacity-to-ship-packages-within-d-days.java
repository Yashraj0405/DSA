class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE, right = 0;
        for(int x : weights){
            left = Math.max(left,x);
            right += x;
        }

        while(left <= right){
            int mid = (left + right) / 2;
            if(daysReq(weights, mid) <= days){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    private int daysReq(int[] weights, int cap){
        int days = 1 , load = 0;
        for(int  weight : weights){
            if(load + weight > cap){
                days++;
                load = weight;
            }else{
                load += weight;
            }
        }
        return days;
    }
}