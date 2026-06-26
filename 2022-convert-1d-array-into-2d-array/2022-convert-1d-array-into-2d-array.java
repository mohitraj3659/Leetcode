class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int start=0;
        if(original.length!=m*n) return new int[][]{};
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[start++];
            }
        }
        return arr;
    }
}