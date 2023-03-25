package HW2;

public class TV_Tester {

	public static void main(String[] args) {

		for (int TV_Number = 1; TV_Number <= 5; TV_Number++) {
			TV tv = randomTV();
			System.out.println("TV number " + TV_Number + ": " + tv.getName() + '\n' + "Plot: " + tv.plot() + '\n');
		}

	}

	public static TV randomTV() {
		int randomRate = (int) (Math.random() * 5) + 1; // rate between 1 and 5 inclusive.
		System.out.println("Random Rate: " + randomRate);
		switch (randomRate) {
		case 1:
			return new TheBlackList();
		case 2:
			return new TheOffice();
		case 3:
			return new Friends();
		case 4:
			return new The100();
		case 5:
			return new TheFlash();
		}
		return null;
	}

}

class TV {
	private String name;// name of a tv

	public TV(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String plot() {
		return "super class TV: Not yet published and actually the storyline has not been written... no plot created. ";
	}

}

class TheBlackList extends TV {
	public TheBlackList() {
		super("The Black List");
	}

	@Override
	public String plot() {
		return "The show follows Raymond (Red) Reddington (James Spader), a former U.S. Navy officer turned high-profile criminal, who voluntarily surrenders to the FBI after eluding capture for decades.";
	}
}

class TheOffice extends TV {
	public TheOffice() {
		super("The Office");
	}

	@Override
	public String plot() {
		return "The Office is an American mockumentary sitcom television series that depicts the everyday work lives of office employees in the Scranton, Pennsylvania branch of the fictional Dunder Mifflin Paper Company.";
	}
}

class Friends extends TV {
	public Friends() {
		super("Friends");
	}

	@Override
	public String plot() {
		return "a show about six friends in New York as they navigate their way through life and learn to grow up as they approach the third decade of their life.";
	}
}

class The100 extends TV {
	public The100() {
		super("The 100");
	}

	@Override
	public String plot() {
		return "Set ninety-seven years after a nuclear war has destroyed civilization, when a spaceship housing humanity's lone survivors sends one hundred juvenile delinquents back to Earth, in hopes of possibly re-populating the planet. ";
	}
}

class TheFlash extends TV {
	public TheFlash() {
		super("The Flash");
	}

	@Override
	public String plot() {
		return "After being struck by lightning, Barry Allen wakes up from his coma to discover he's been given the power of super speed, becoming the next Flash, fighting crime in Central City.";
	}
}
