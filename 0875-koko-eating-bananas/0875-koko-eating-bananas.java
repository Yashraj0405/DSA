class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);  // max pile = upper bound
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, mid, h)) {
                right = mid;              // try smaller speed
            } else {
                left = mid + 1;           // need faster speed
            }
        }

        return left;
    }

    private boolean canFinish(int[] piles, int mid, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + mid - 1) / mid; // ceiling division without Math.ceil
        }
        return hours <= h;
    }
}