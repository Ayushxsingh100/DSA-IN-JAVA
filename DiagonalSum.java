public class DiagonalSum {
    public static void diagonalsum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length; 
        
        // FOR THE PRIMARY DIAGONAL ( 1 , 6 , 11 ,16 )
        // in this case  ( i == j )
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            
        // FOR THE SECONDARY DIAGONAL (4 , 7 , 10 , 13 )
            // SUM OF 3 ( we can use it like (n-1) is the actual length and - i for getting 3 as a sum of [i][j]
            if (i != n - 1 - i) { 
                sum += matrix[i][n - 1 - i];
            }
            System.out.println(sum);
        }
        
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        diagonalsum(matrix);
    }
}