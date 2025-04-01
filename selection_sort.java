public class selection_sort {
    public static void selection(int arr[]){
        for ( int i = 0 ; i<arr.length - 1 ; i++){
            int minPos = i;
            for ( int j = i+1 ; j<arr.length-1 ; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
    }
}
