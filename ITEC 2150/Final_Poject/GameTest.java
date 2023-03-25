package Final_Poject;

import java.util.*;

public class GameTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of player");
		String str = input.nextLine();
		System.out.println("Enter damage points");
		int point = input.nextInt();
		
		Blaster b1 = new Blaster("E-11 Blaster Rifle", 10);	
		Trident t1 = new Trident(20,"Level 2 Trident");
		Player p1 = new Player("E-11 Blaster Rifle",point,str,100);
		Bot bot = new Bot("Trident",10,100,"Robot");
		
		while(p1.healthPoints() > 0 && bot.healthPoints() > 0 ) {
		p1.healthPoints();
		bot.healthPoints();
		b1.hit();
		t1.hit();
		p1.healthPoints();
		bot.healthPoints();		
		}
		
		if(p1.healthPoints() > bot.healthPoints()) {
			System.out.println("You Win!!!!!");
		}				
		else {
			System.out.println("You were defeated by the bot.");
		}
		
		
	}

}
