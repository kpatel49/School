package Final_Poject;

public class Blaster implements WeaponInterface{
	
	public int damage;
	public String name;
	
//	public Blaster() {
//		this.damage = 5;
//		this.name = "E-11 Blaster Rifle";
//		this.reload();				
//	}
	
	public Blaster(String name, int damage) {
		this.name = name;
		this.damage = damage;
		this.reload();
	}
	@Override
	public int getDamage() {
		return damage;
	}
	
	@Override
	public int hit() {
		System.out.println(name + " shot for " + damage + " damage");
		return this.damage;
	}
	
	@Override
	public void reload() {
		System.out.println(name + ": was reloaded");
	}
	

}
