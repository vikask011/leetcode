class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n = matrix[0].length;
        List<int[]> zeros=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeros.add(new int[]{i,j});
                }
            }
        }
        for(int[] pos:zeros){
            int r=pos[0];
            int c=pos[1];

            for(int j=0;j<n;j++){
                matrix[r][j]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][c]=0;
            }
        }
    }
}