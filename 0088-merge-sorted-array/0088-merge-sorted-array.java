class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];
        int i = 0;

        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < m && idx2 < n) {

            if(nums1[idx1] <= nums2[idx2]) {
                result[i] = nums1[idx1];
                i++;
                idx1++;
            }
            else {
                result[i] = nums2[idx2];
                i++;
                idx2++;
            }
        }

        while(idx1 < m) {
            result[i] = nums1[idx1];
            i++;
            idx1++;
        }

        while(idx2 < n) {
            result[i] = nums2[idx2];
            i++;
            idx2++;
        }

        for(i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
    
}