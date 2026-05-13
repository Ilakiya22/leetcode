class Solution {
    public int maximumProduct(int[] nums) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if (i > thirdLargest) {
                thirdLargest = i;
            }

            if (i < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = i;
            } else if (i < secondSmallest) {
                secondSmallest = i;
            }
        }
        return Math.max(firstLargest * secondLargest * thirdLargest, firstLargest * firstSmallest * secondSmallest);
    }
}