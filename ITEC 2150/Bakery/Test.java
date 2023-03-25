package Bakery;

public class Test {

	public static void main(String[] args) {

		Bread b1 = new Bread(3, 1, 2, 1.5, "Bread", 2);
		System.out.println(b1.toString() + "\n");
		b1.recipe();

		SourdoughBread sd = new SourdoughBread(5, 1.5, 2.5, 5, "Sourdough", 1, 1);
		System.out.println(sd.toString() + "\n");
		sd.recipe();

		Pita p1 = new Pita(3.5, 1.5, 1, 1, "Pita", 1, 1);
		System.out.println(p1.toString());
		p1.recipe();

		Rye r1 = new Rye(2.5, .25, 1.5, 1, "Rye ", 3, 1, 3, 1, 1, 1, 1);
		System.out.println(r1.toString());
		r1.recipe();
		
		Baguettes bg = new Baguettes(3.5,2,2,"Baguettes",2,3);
		System.out.println(bg.toString());
		bg.recipe();
		
		Pastry cp = new Pastry(1,1," Cheese Puffs ",1,.5,1,3,1,.5);
		System.out.println(cp.toString());
		cp.recipe();

	}

}
