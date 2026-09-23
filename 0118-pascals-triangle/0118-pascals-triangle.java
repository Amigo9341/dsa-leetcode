class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<Integer> abc = new ArrayList<>();
        abc.add(1);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(abc);

        for(int i = 1; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            rows.add(1);

            for(int j = 1; j < i; j++) {
                rows.add(ans.get(i - 1).get(j-1) + ans.get(i - 1).get(j));
            }

            rows.add(1);
            ans.add(rows);
        }
        return ans;
    }
}