package Recursion;

public class RecursionPractice {

	public static void main(String[] args) {
		System.out.print(displayString("#", 3)+"\n");
		//System.out.print(getMultiChar("y",4));
		System.out.println(getPowerOfTen(5));
		System.out.println(factorial(3));
		System.out.println(getPowerOfTenLoop(3));
		System.out.println(getNumberOfZerosLoop(2030));
		System.out.println(getNumberOfZerosRecursion(200030));
	}
	public static String displayString(String str, int n){
		  if(n == 0){
		    return "";
		  }
		  else {
		    return str + displayString(str, n-1);
		  }
		}
	public static String getMultiChar(char ch, int n){
		  String str = Character.toString(ch);
		  if(n == 0){
		    return str;
		  }
		  else{
		    return str + getMultiChar(ch, n-1);
		  }
		}
	public static long getPowerOfTen(int n){
		  if(n == 0){
		    return 1;
		  }
		  else{
		    return (10 *getPowerOfTen(n-1));
		  }
		}
	public static int factorial(int n) {
		  if(n == 1){
		    return 1;
		  }
		  else{
		    return n * factorial(n-1);
		  }
		}
	public static long getPowerOfTenLoop(int n){
		  long total = 1;
		  while(n != 0){
		    total *= 10;
		    n--;
		  }
		  return total;
		}
	public static int getNumberOfZerosLoop(int n){
		 String str = Integer.toString(n);
		 int count = 0;
		 
		 for(int i = str.length() -1; i >= 0; i--){
		   if (str.charAt(i) != '0'){
		     break;
		   }
		   else{
		     count++;
		   }
		 }
		 return count;
		}
	public static int getNumberOfZerosRecursion(int n){
		  if(n == 0){
		    return 1;
		  }
		  else if(n < 10){
		    return 0;
		  }
		  else if(n % 10 == 0){
		    return 1+getNumberOfZerosRecursion(n/10);
		  }
		  return getNumberOfZerosRecursion(n/10);
		  
		}




}
