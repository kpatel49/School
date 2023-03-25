package Final_Poject;

public class Trident implements WeaponInterface{
	
	public int damage;
	public String name;
	
	public Trident() {
		this.damage = 8;
		this.name = "Level 1 Trident";
	}
	
	public Trident(int damage, String name) {
		this.damage = damage;
		this.name = name;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}
	
	@Override
	public int hit() {
		System.out.println(name + " dealt " + damage + " damage");
		return damage;
	}

	@Override
	public void reload() {
		System.out.println(name + "'s durability has gone down");		
	}	

}
