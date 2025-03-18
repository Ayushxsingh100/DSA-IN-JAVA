public class HOLLOW_RECTANGLE {

    public static void pat(int totalrows , int totalcolumns){
     for(int i = 1; i <= totalrows ;i++){
       for(int j=1 ; j <= totalcolumns ; j++){
         if( i==1 || i== totalrows || j==1 || j == totalcolumns){
            System.out.print("*");
         }
         else{
            System.out.print(" ");
         }
        }
         System.out.println();
       
     }
    }

    public static void main(String[] args) {
        pat(4, 4  );
    }


}