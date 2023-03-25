package Bakery;

public class SourdoughBread extends Bread{
	
	private double starter;

	public SourdoughBread(double flour, double water, double salt, double yeast,
			String breadName,double suger, double starter) {
		super(flour, water, salt,yeast,breadName,suger);
		this.starter = starter;
	}

	public double getStarter() {
		return starter;
	}

	public void setStarter(int starter) {
		this.starter = starter;
	}

	@Override
	public String toString() {
		return (super.toString()+ "\n"+ starter + " cup of ripe sourdough starter");
	}
	
	public void recipe() {
		System.out.println("A recipe of Sourdough Bread:\n"
					+ "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\r\n" + 
					"2. Make the dough\r\n" + 
					"3. Bulk Rise\r\n" +
					"4. Stretch and fold the dough\r\n" + 
					"5. Cut and shape the dough\r\n" + 
					"6. Second rise\r\n" + 
					"7. Preheat the oven to 450°F towards the tail end of the second rise.\r\n" + 
					"8. Spray the laof with luke warm water.\r\n" + 
					"9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\r\n" + 
					"10. Remove the bread from the oven.\r\n" + 
					"11.Let the bread cool until good to eat.\r\n"  
					);
				
	}
	

}
