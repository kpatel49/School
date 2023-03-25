package Final;

public class RecursiveReverse {
	
	public static void main(String[] args) {
		
		System.out.println(reversed("car"));
	}

	public static String reversed(String str) {
	     
		if(str.length() == 0) {
			return "";
		}
		else {
			return str.substring(str.length()-1) + reversed(str.substring(0,str.length()-1));
		}
	    }
	
}
