class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();

        long ans = 1;

        result.add(1);

        for(int c = 0; c < rowIndex; c++) {
            
            ans = ans * (rowIndex - c);
            ans = ans / (c + 1);

            result.add((int)ans);

        }
        return result;
        
    }
}