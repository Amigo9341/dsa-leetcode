class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<Integer> Aman = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Aman.add(1);
        ans.add(Aman);

        for(int i = 1; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 1; j < i; j++) {    
                row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }

            row.add(1);
            ans.add(row);
        }

        return ans;
        
    }
}