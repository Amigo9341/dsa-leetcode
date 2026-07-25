class Solution {
    public void sortColors(int[] nums) {
        
        int zeroidx = -1;
        int twoidx = nums.length;
        int oneidx = 0;

        while (oneidx < twoidx) {

            if (nums[oneidx] == 0) {
                zeroidx++;
                swap(nums, zeroidx, oneidx);
                oneidx++;
            }
            else if (nums[oneidx] == 2) {
                twoidx--;
                swap(nums, twoidx, oneidx);
            }
            else {
                oneidx++;
            }
        }
        
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}