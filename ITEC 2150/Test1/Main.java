package Test1;

public class Main {

	public static void main(String[] args) {
		WaffleHouse wh1 = new WaffleHouse(2,2,2,2,5);
		System.out.println("=====WhaffleHouse=====");
		System.out.println(wh1.toString());
		IHOP iw1 = new IHOP(1.5,2.5,2.5,1.5,15);
		System.out.println("=====IHOP=====");
		System.out.println(iw1.toString());

	}

}
