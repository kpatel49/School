package Final_Poject;

public class Player extends Trident{
	
	public String nameP;
	public int health;
	
	public Player(String name, int damage, String nameP, int health) {
		super(damage,name);
		this.health = health;
		this.nameP = nameP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int healthPoints() {
		int health1 = 0;
		if(this.health > 0) {
			this.health -= this.damage;
			System.out.println("Player health is " + this.health);
			health1 = this.health;
			return health1;
		}
		else {
			System.out.println("You were killed");
		}
		return health1;
	}

}
