class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for(int i = 0; i <= n - 2; i++) {
            for(int j = i + 1; j <= n - 1; j++) {
                swap(matrix, i, j);
            }
        }
        for(int i = 0; i <= n - 1; i++) {
            int idx1 = 0;
            int idx2 = n - 1;
            while(idx1 < idx2) {
                swap1(matrix[i], idx1, idx2);
                idx1++;
                idx2--;
            }
        }
        
    }

    public void swap(int arr[][], int a, int b) {
        int temp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = temp;
    }
    public void swap1(int arr1[], int a, int b) {
        int temp = arr1[a];
        arr1[a] = arr1[b];
        arr1[b] = temp;
    }

}