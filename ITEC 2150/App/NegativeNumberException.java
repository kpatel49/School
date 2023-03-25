package App;

public class NegativeNumberException extends Exception{
	   private int number;

	   public NegativeNumberException(int number){
	      super("Negative Number input: " + number);
	      this.number = number;
	   }

	   public int getNumber(){
	      return number;
	   }
	}