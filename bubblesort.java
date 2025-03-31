public class bubblesort {
    public static void algorithm(int arr[]){
        for(int turns = 0 ; turns < arr.length-1 ; turns ++){
            for( int j = 0 ; j < arr.length -1-turns ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    //swapping 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Example unsorted array
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Apply Bubble Sort
        algorithm(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

}
}
