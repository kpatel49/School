package Bakery;

public class Pastry extends Bread{
	private double milk;
	private int butter;
	private int eggs;
	private double cheese1;
	private double cheese2;
	
	public Pastry(double flour,double salt, String breadName, double suger, double milk,
			int butter, int eggs, double cheese1, double cheese2) {
		super(flour, salt, breadName, suger);
		this.milk = milk;
		this.butter = butter;
		this.eggs = eggs;
		this.cheese1 = cheese1;
		this.cheese2 = cheese2;
	}

	public double getMilk() {
		return milk;
	}

	public void setMilk(double milk) {
		this.milk = milk;
	}

	public int getButter() {
		return butter;
	}

	public void setButter(int butter) {
		this.butter = butter;
	}

	public int getEggs() {
		return eggs;
	}

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public double getCheese1() {
		return cheese1;
	}

	public void setCheese1(double cheese1) {
		this.cheese1 = cheese1;
	}

	public double getCheese2() {
		return cheese2;
	}

	public void setCheese2(double cheese2) {
		this.cheese2 = cheese2;
	}

	@Override
	public String toString() {
		return ("Ingredients of "+ breadName + " Bread are:\n"+
				milk + " cup milk\n" + butter + " stick of unsalted butter, cut into pieces\n"+
				suger + " tbsp of suger\n"+ salt +" tsp of salt\n"+ flour +" cup of flour\n"+
				eggs +" large eggs\n"+ cheese1 +" cup grated Cheddar cheese\n"+
				cheese2 +" cup frated Gruyere cheese");
	}
	public void recipe() {
		System.out.println("Step 1: Preheat the oven to 425 degrees F. Line 2 baking sheets with parchment. Set aside.\n"+
				"Step 2: In a saucepan, combine 1/2 cup water with the milk, butter, sugar and salt and stir over low heat until the sugar, butter and salt have melted. Raise the heat to medium and bring to a healthy simmer.\n"+
				"Step 3: Take from the heat and immediately add the flour. Stir with a wooden spoon until the mixture thickens, is smooth and no flour lumps remain. Return to the heat and cook, stirring, until a film forms on the bottom of the pan. Continue stirring, careful not to scrape up the film, for a minute or two more.\n"+
				"Step 4: Transfer the mixture (panade) to a food processor. Mix for a minute to dissipate the heat. Add the eggs one at a time with the processor running. Pay attention to the consistency of the paste. It should be smooth and shiny, so you may only need 3 of the eggs. Stir in the cheese.\n"+
				"Step 5: Using a small cookie scoop, scoop generous mounds onto the parchment-lined baking sheets, spacing them an inch apart. Place in the oven, immediately reduce the heat to 375 degrees F and bake for 20 to 25 minutes, or until the cheese puffs are golden brown.");
	}
	

}
