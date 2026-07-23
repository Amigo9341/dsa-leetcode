class Solution {
    public void rotate(int[] nums, int k) {

        int start = 0;
        int end = 0;
        k = k % nums.length;

        // first subarray reverse
        Reverse(nums, 0, nums.length - k - 1);

        // second subarray reverse
        Reverse(nums, nums.length - k, nums.length - 1);

        // entire array reverse
        Reverse(nums, 0, nums.length - 1);
        
    }

    private void Reverse(int[] nums, int start, int end) {
        while (start < end) {
            Swap(nums, start++, end--);
        }
    }

    private void Swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}