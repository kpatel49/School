package Final_Poject;

public class Bot extends Blaster{
	
	private int health;
	private String botName;
	
	public Bot(String name , int damage, int health, String botName) {
		super(name,damage);
		this.health = health;
		this.botName = botName;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}
	
	public int healthPoints() {
		int hp = 0;
		if(this.health > 0) {
			
			this.health -= this.damage;
			System.out.println("Bot health is " + this.health);
			hp = this.health;
			return hp;			
		}
		else {
			System.out.println("The bot was killed");
		}
		return hp;
	}
	
	
	

}
