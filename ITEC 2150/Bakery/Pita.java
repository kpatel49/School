package Bakery;

public class Pita extends Bread {
	private double oil;

	public Pita(double flour, double water, double salt, double yeast, String breadName, double suger, double oil) {
		super(flour, water, salt, yeast, breadName, suger);
		this.oil = oil;
	}

	public double getOil() {
		return oil;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}

	@Override
	public String toString() {
		return (super.toString()+"\n"+ oil + " tsp olive oil");
	}
	public void recipe() {
		System.out.println("Step 1: In the bowl of a heavy-duty electric mixer fitted with a dough hook, combine the yeast, sugar, and warm water; stir to blend. Let the yeast stand until foamy, about 5 to 10 minutes.\n"+
				"Step 2: Stir in the salt. Add the flour, a little at a time, mixing at the lowest speed until all the flour has been incorporated and the dough gathers into a ball; this should take about 4 minutes.\n"+
				"Step 3: Turn the dough onto a lightly floured surface and knead until it's smooth and elastic. Transfer the dough to a lightly oiled bowl, turn it over to coat, and cover with plastic wrap. Allow to rise until double in size, about 1 1/2 hours.\n"+
				"Step 4: Place a large pizza stone on the lower oven rack, preheat the oven (and stone) to 500 degrees F.\n"+
				"Step 5: Take 1/8 of the dough and roll it into a 8 inch circle\n"+
				"Step 6: Than place the rolled out dough in the oven and bake for 3 to 4 minutes\n"+
				"Step 7: Let it cool for 5 minutes and enjoy");
		
	}
	
	

}
