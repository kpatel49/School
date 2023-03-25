package Bakery;

public class Bread {
	
	public double flour;
	public double water;
	public double salt;
	public double yeast;
	public String breadName;
	public double suger;
	
	
	
	
	public Bread(double flour, double water, double salt,double yeast, String breadName,double suger) {
		this.flour = flour;
		this.water = water;
		this.salt = salt;
		this.yeast = yeast;
		this.breadName = breadName;
		this.suger = suger;
		
	}
	public Bread(double flour, double salt, String breadName,double suger) {
		this.flour = flour;		
		this.salt = salt;
		this.breadName = breadName;
		this.suger = suger;
		
	}
	public Bread(double flour, double salt, double yeast, String breadName) {
		this.flour = flour;		
		this.salt = salt;
		this.yeast = yeast;
		this.breadName = breadName;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}
	public double getYeast() {
		return yeast;
	}

	public void setYeast(double yeast) {
		this.yeast = yeast;
	}

	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	
	public double getSuger() {
		return suger;
	}

	public void setSuger(double suger) {
		this.suger = suger;
	}

	@Override
	public String toString() {
		return "Ingredients of " + breadName +" are:\n" + flour + " cups of flour\n" + water + " cups of water\n" + salt + " tsps of salt\n" + yeast + " tsp of yeast\n" + suger + " tsp of suger";
	}
	
	
	public void recipe() {
		System.out.println("STEP 1: ASSEMBLE BREAD INGREDIENTS\r\n" + 
				"STEP 2: DISSOLVE THE YEAST AND ACTIVATE IT BY PROOFING\r\n" + 
				"STEP 3: ADD REMAINING INGREDIENTS AND MIX\r\n" + 
				"STEP 4: KNEAD THE BREAD\r\n" + 
				"STEP 5: FIRST RISE\r\n" + 
				"STEP 6: PUNCH DOUGH AND SHAPE IT\r\n" + 
				"STEP 7: SECOND RISE\r\n" + 
				"STEP 8: BAKE THE BREAD\r\n" + 
				"STEP 9: COOL THE BREAD\r\n" + 
				"STEP 10: CUT AND ENJOY");
	}
	
	
	
	
	

}
