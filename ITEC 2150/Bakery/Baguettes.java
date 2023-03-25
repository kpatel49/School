package Bakery;

public class Baguettes extends Bread {
	
	private double honey;
	private int iceCube;
	public Baguettes(double flour, double salt, double yeast, String breadName, double honey, int iceCube) {
		super(flour, salt, yeast, breadName);
		this.honey = honey;
		this.iceCube = iceCube;
	}
	public double getHoney() {
		return honey;
	}
	public void setHoney(double honey) {
		this.honey = honey;
	}
	public int getIceCube() {
		return iceCube;
	}
	public void setIceCube(int iceCube) {
		this.iceCube = iceCube;
	}
	@Override
	public String toString() {
		return ("Ingredients of "+ breadName +" are:\n"+ flour +" cups of flour \n"+ salt +" tsp of salt\n"+ yeast +" dry active yeast\n" + honey + " tbsp of honey\n"+ iceCube + " ice cubes");
	}
	
	public void recipe() {
		System.out.println("Step 1: Combine the honey, yeast and 1/2 cup warm water. Stir to combine and let the mixture stand until the yeast is activated and begins to foam, 5 minutes.\n"+
				"Step 2: Mix the dry and wet ingredients and knead until the dough is smooth and elastic\n"+
				"Step 3: Form the dough into a ball, place it in a lightly-oiled bowl and cover with a dishcloth, so it doesn't dry out. Let rest in a warm environment until doubled in size, 25 to 30 minutes.\n"+
				"Step 4: Than take the dough and shape it into 2 12 inch rectangle\n"+
				"Step 5: Score the tops of the loaves, making deep diagonal slits 1/2-inch deep, cover with a dishcloth and let rise in a warm environment until they have doubled in size, 25 minutes.\n"+
				"Step 6: Preheat the oven to 450 degrees F\n"+
				"Step 7: After it's doubled in size bake it until golden brown,15 minutes\n"+
				"Step 8: Let it cool and enjoy");
		
	}

	
	

}
