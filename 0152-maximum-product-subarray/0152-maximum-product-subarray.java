class Solution {
    public int maxProduct(int[] nums) {

        int maximumProduct = nums[0];
        int minimumProduct = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = maximumProduct;
                maximumProduct = minimumProduct;
                minimumProduct = temp;
            }
            maximumProduct = Math.max(nums[i], nums[i] * maximumProduct);
            minimumProduct = Math.min(nums[i], nums[i] * minimumProduct);
            ans = Math.max(maximumProduct, ans);

        }
        return ans;
          
    }     
}