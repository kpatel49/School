package Hello;

public class Main {

	public static void main(String[] args) {
		Hello marco = new Hello();
		
		//Marco Chairez is taking ITEC2150
		System.out.println(marco.getName() + "is taking "+marco.getIntroduction());
		
		Hello kris = new Hello("Kris Hendricks","ITEC 3200");
		System.out.println(kris.getName() + "is taking " + kris.getIntroduction());

	}

}
