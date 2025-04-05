  public class spiral_matrix {

    public static void printspiral(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // (left to right) - Top row
            System.out.print("Top row: ");
            for (int j = startcol; j <= endcol; j++) {
                System.out.print("(" + matrix[startrow][j] + ") ");
            }
            System.out.println(); // New line for separation
            

            // (top to bottom) - Right column
            System.out.print("Right column: ");
            for (int i = startrow +1 ; i <= endrow; i++) {
                System.out.print("(" + matrix[i][endcol] + ") ");
            }
            System.out.println(); // New line for separation
            

            // (right to left) - Bottom row
            if (startrow <= endrow) {
                System.out.print("Bottom row: ");
                for (int j = endcol-1; j >= startcol; j--) {
                    System.out.print("(" + matrix[endrow][j] + ") ");
                }
                System.out.println(); // New line for separation
                
            }

            // (bottom to top) - Left column
            if (startcol <= endcol) {
                System.out.print("Left column: ");
                for (int i = endrow-1; i >= startrow+1; i--) {
                    System.out.print("(" + matrix[i][startcol] + ") ");
                }
                System.out.println(); // New line for separation
            
            }
            startcol++;
            startrow ++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printspiral(matrix); // Call the method
    }
}
