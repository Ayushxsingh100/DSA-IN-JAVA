public class maxSubarrayusingbruteforce{

    public static int maxsubarray(int [] numbers){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0 ; i < numbers.length ; i++){
            int start = i;
          for(int j = i ; j< numbers.length ; j++){
            currsum=0;
            int end = j;
              for( int k = start ; k <= end ; k++){
                currsum = numbers[k] + currsum ;
              }
              System.out.println(" the value of curr sum is " + currsum);
              if(maxsum < currsum){
                maxsum = currsum;
              }
          }
    }
    return  maxsum;
}
    public static void main(String[] args) {
        int [] num = { 1,-2,6,-1,3};
        System.out.print(maxsubarray(num));
    }
}