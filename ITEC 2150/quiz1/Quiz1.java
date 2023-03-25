package quiz1;

/**
 * Your tasks are complete getReverseString(), getReverseStringForeach(), and convertStringToCharArray() methods.
 *
 */
import java.util.Arrays;
public class Quiz1 {
    public static void main(String[] args) {

        String reversedValue = getReverseString("voldemort");
        char[] list = convertStringToCharArray(reversedValue);
        System.out.println(Arrays.toString(list));
        System.out.println(getReverseStringForeach(list)); //this will printout original order of the String characters.
        //Then, change this output to generate an output starting with an uppercase.
        String output = getReverseStringForeach(list);

        //OR if getReverseStringForeach(list) only display output all lowercase, then you can write as below.
        System.out.println(Character.toUpperCase(output.charAt(0)) + output.substring((1)));
    }

    public static String getReverseString(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            result  = str.charAt(i) + result ;
        }
        return result;
    }

    public static String getReverseStringForeach(char[] chars){
        String result = "";
        for(char c: chars){
            result = c + result;
        }
        return result;
    }

    public static char[] convertStringToCharArray(String str){
        char[] chList = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            if(i == str.length() -1 ){
                chList[i] = Character.toUpperCase(str.charAt(i));
            }
            else {
                chList[i] = str.charAt(i);
            }
        }
        return chList;
    }
}