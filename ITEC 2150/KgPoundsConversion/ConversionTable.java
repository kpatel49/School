package KgPoundsConversion;

/**
 * you will write a program of a conversion table of kg-pounds and pounds-kg
 * kilogram   pounds    |   pounds   kilogram
 * 1          2.205     |   20       9.070
 * 3          6.615     |   25       11.35
 *
 * 199
 */
public class ConversionTable {

    public static void main(String[] args) {
        System.out.printf("%5s%8s%4s%12s%11s\n","kilogram","pounds","|","pounds","kilogram");

        int pounds = 20;

        for(int kilogram = 1; kilogram < 200; kilogram += 2){
            System.out.printf("%5d%10.3f%5s%10d%10.3f\n", kilogram,pounds(kilogram),"|", pounds, kg(pounds));
            pounds += 5;
        }

    }
    
    public static double kg(int pounds){
        return pounds / 2.205;
    }

    public static double pounds(int kg){
        return kg * 2.205;
    }

}