class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int product = 1;

        for (int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            ans[i] = product;
        }
        
        ans[0] = 1;
        product = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            product *= nums[i + 1];
            ans[i] = ans[i] * product;
        }

        return ans;
    }
}