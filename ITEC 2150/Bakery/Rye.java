package Bakery;

public class Rye extends Pita {
	private double butter;
	private int egg;
	private double milk;
	private double ryeFlour;
	private double seeds;
	
	public Rye(double flour, double water, double salt, double yeast, String breadName, double suger, double oil,
			double butter, int egg, double milk, double ryeFlour, double seeds) {
		super(flour, water, salt, yeast, breadName, suger, oil);
		this.butter = butter;
		this.egg = egg;
		this.milk = milk;
		this.ryeFlour = ryeFlour;
		this.seeds = seeds;
	}

	public double getButter() {
		return butter;
	}

	public void setButter(double butter) {
		this.butter = butter;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	}

	public double getMilk() {
		return milk;
	}

	public void setMilk(double milk) {
		this.milk = milk;
	}

	public double getRyeFlour() {
		return ryeFlour;
	}

	public void setRyeFlour(double ryeFlour) {
		this.ryeFlour = ryeFlour;
	}

	public double getSeeds() {
		return seeds;
	}

	public void setSeeds(double seeds) {
		this.seeds = seeds;
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + butter + " tbsp of melted butter\n" + egg + " egg\n"+
				milk + " cup of milk\n"+ ryeFlour + " cup of rye flour\n" + seeds + " tbsp of caraway seeds");
	}
	
	public void recipe() {
		System.out.println("Step 1: Combine the yeast, sugar, melted butter, egg, and milk in the bowl of an electric mixer fitted with a dough hook.\n"+
				"Step 2: Beat on low speed for 1 minute. Add the salt, rye flour, all-purpose flour, and caraway seeds. Beat at low speed until all of the flour is incorporated, about 1 minute. \n"+
				"Step 3: Remove the dough from the bowl. Using your hands, form the dough into a smooth ball.\n"+
				"Step 4: Lightly oil a bowl. Place the dough in the bowl and turn it to oil all sides. Cover with plastic wrap and set aside in a warm, draft-free place until it doubles in size, about 1 hour.\n"+
				"Step 5: Preheat the oven to 350 degrees F and lightly grease a 5 1/2 by 9-inch baking pan.\n"+
				"Step 6: Gently knead the dough several times. Tuck and roll so that any seams disappear into the dough and place in the prepared baking pan.\n"+
				"Step 7: Cover with plastic wrap and set aside in a warm, draft-free place until it doubles in size, about 1 hour.\n"+
				"Step 8: Use a pastry brush to brush the egg lightly over the top of the dough. Bake until lightly brown, about 45 minutes.\n"+
				"Step 9: Remove form the oven and cool on a rack");
	}
	
	
	
	
	
	

}
