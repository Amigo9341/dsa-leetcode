class Solution {
    public void moveZeroes(int[] nums) {
        int curr = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                curr++;

                if(nums[curr] == 0){
                    swap(nums, i, curr);
                }
            }
        }       
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}