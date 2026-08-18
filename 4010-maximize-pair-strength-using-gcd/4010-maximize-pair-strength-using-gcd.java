class Solution {
    public long maxPairStrength(int[] nums) {

        long res = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                long product = 1L * nums[i] * nums[j];
                long gc = gcd(nums[i], nums[j]);

                long ans = product / (gc * gc); 

                res = Math.max(res, ans);
            }
        }

        return res;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}