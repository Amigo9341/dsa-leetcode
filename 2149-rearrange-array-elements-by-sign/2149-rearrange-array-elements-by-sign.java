class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];

        int posidx = 0, negidx = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result[posidx] = nums[i];
                posidx += 2;
            }
            else{
                result[negidx] = nums[i];
                negidx += 2;
            }
        }
        return result;

        
    }
}