package Matrix;

public class 48.RotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            int i = 0;
            int n = matrix.length-1;
            while(i < n) {
                for(int a =0;i+a<n;a++){
                    int temp = matrix[i][i+a];    
                    matrix[i][i+a] = matrix[n-a][i];
                    matrix[n-a][i] = matrix[n][n-a];
                    matrix[n][n-a] = matrix[i+a][n];
                    matrix[i+a][n] = temp;
                }
                i++;
                n--;
            }
        }
    }
}
