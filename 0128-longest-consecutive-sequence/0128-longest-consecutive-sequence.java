class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int lcon = 1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == prev) {
                continue;
            }

            if ((long) nums[i] == (long) prev + 1) {
                count++;
            } 
            else {
                count = 1;
            }

            prev = nums[i];
            lcon = Math.max(lcon, count);
        }

        return lcon;
    }
}