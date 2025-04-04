import java.util.Scanner;

public class MultidimensionalArrays {

    public static boolean searchArray(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at [" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for a 4x4 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        searchArray(matrix, key);

        sc.close();
    }
}