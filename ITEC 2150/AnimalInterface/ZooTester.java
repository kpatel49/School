package AnimalInterface;

public class ZooTester {

	public static void main(String[] args) {
		
		AnimalI chicken = new AnimalI(5,"F",50);
		AnimalI chicken2 = new Chicken(10,"M",50,50,10);
		
		AnimalI swan = new Swan(10,"F",100,100,50);
		Bird chicken3 = new Chicken(10,"F",45,100,20);
		Bird swan2 = new Swan(10,"M",200,200,67);
		
		Swan swan3 = new Swan(10,"F",20,20,67);
		
		swan3.fly();
		((Swan)swan2).fly();
		

	}

}
