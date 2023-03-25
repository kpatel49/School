package AnimalInterface;

public class Swan extends Bird implements IFlyable{

	public Swan(int age, String gender, int weight, double wingSpan, double height) {
		super(age, gender, weight, wingSpan, height);		
	}
	
	@Override
	public void fly() {
		System.out.println(" can fly...");
	}
	

}
