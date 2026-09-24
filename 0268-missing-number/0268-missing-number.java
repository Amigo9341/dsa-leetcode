class Solution {
    public int missingNumber(int[] nums) {

        int num = nums.length;

        for (int i = 0; i <= num; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }
}