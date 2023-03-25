package Loop;

public class Pyramid {

    public static void main(String[] args) {

       for(int row = 1; row <= 7; row++ ){

           //leading space
           for(int column = 1; column <= 7- row; column++){
               System.out.printf("%3s"," ");
           }

           for(int column = 1; column <= row; column++){
               System.out.printf("%3d",column);
           }

           for(int column = row - 1; column >= 1; column--){
               System.out.printf("%3d",column);
           }
           
           System.out.println();

       }
       
    }
}
