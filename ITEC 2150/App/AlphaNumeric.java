package App;

/**
 * Class: AlphaNumeric
 * @author Type Your Name
 * @version 1.0
 * written XXXXXXXX
 * this is to generate an method to filter non-alpha-numerical characters out of
 * a given String value.
 *
 */
public class AlphaNumeric {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string including non-alpha-numeric characters: ");
        String sentence = sc.nextLine();
        System.out.println(filter(sentence));
    }
    public static String filter(String s){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
