package Loop;

public class OppositeTriangle {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++){

            //print the *
            for(int space = 5 - row ; space >= 1; space-- ){
                System.out.print(" " + " ");
            }

            for(int number = row; number >= 1; number--){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
