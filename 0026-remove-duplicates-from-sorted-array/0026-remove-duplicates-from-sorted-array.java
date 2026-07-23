class Solution {
    public int removeDuplicates(int[] nums) {

        int idx = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != nums[idx]) {
                idx++;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        return idx += 1;
        
    }
}