public class SearchInSortedMatrix {
    public static boolean stairSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1; 

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) { 
                col--; 
            } else {
                row++; 
            }
        }
        return false; 
    }
}