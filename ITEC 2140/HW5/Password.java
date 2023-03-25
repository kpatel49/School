package HW5;

public class Password {

    public static boolean isValid(String password) {

        if (password.length() < 8) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }

        
        return ((numCount >=8) || (charCount >= 2 && numCount >= 2));
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (Character.isLetter(ch));
    }


    public static boolean is_Numeric(char ch) {

        return (Character.isDigit(ch));
    }

}
