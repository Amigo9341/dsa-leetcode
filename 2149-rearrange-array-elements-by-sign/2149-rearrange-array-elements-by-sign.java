class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int[] result = new int[n];

        int p = 0, q = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                pos[p++] = nums[i];
            }
            else{
                neg[q++] = nums[i];
            }
        }
        for(int i = 0; i < n/2; i++) {
            result[2 * i] = pos[i];
            result[2 * i + 1] = neg[i];
        }
        return result;
    }
}