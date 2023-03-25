package KgPoundsConversion;


/**
 * kilogram    pounds
 * ------------------
 * 1           2.205
 * 3           6.615
 * 5           11.025
 * 7           15.435
 */

public class KgToPounds {
    public static void main(String[] args) {

        System.out.printf("%-14s%10s\n", "kilograms", "pounds");
        System.out.println("--------------------------------");

//        for(int kilogram = 1; kilogram < 200; kilogram += 2 ){
//            System.out.printf("%-14d%10.3f\n",kilogram, kilogram * 2.205) ;
//        }

        int kilogram = 1;
        while(kilogram < 200){
            System.out.printf("%-14d%10.3f\n",kilogram, kilogram * 2.205) ;
            kilogram += 2;
        }
    }
}
