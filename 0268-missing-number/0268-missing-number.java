class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int actsum = 0;
        int expsum = (n*(n + 1))/2;

        for(int i = 0; i < nums.length; i++) {
            actsum += nums[i];
        }
        int missingnum = expsum - actsum;
        return missingnum;

    }
}