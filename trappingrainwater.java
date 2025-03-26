public class trappingrainwater {
    public static int trappingwater(int height []){
               int n = height.length;
               // calculating the left max 
               int leftmax[] = new int [n];
               leftmax[0] = height[0];
               for( int i = 1 ; i<n ; i++){
                leftmax[i] = Math.max(height[i],leftmax[i-1]);
               }
               // calculating the right max 
               int rightmax[] = new int [n];
               rightmax[n-1] = height[n-1];
               for ( int i = n-2 ; i>=0 ; i--){
                rightmax[i] = Math.max(height[i],rightmax[i+1]);
               }
               // calculating the trapped water 
               int trappedwater=0;
                for(int i =0 ; i<n ; i++){
                    int waterlevel = Math.min(leftmax[i], rightmax[i]);
                    trappedwater += waterlevel - height[i];
                }
        return trappedwater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int result = trappingwater(height); 
        System.out.println("Trapped Water: " + result); 
    }
    
}
