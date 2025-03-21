

public class pairs_array {
    public static void printnum(int num[]) {
        // this loop iterates for current number (2,4,6,8,10)
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            // this will iterate for all remaining number except the number that is contained in (i)
            for (int j = i + 1; j < num.length; j++) {
                int next = num[j];
                System.out.print("(" + current + "," + next + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10}; 
        printnum(num);
    }
}
