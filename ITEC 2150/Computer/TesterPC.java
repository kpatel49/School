package Computer;

public class TesterPC {

	public static void main(String[] args) {
		Dimension di = new Dimension(9, 18, 17);
		Case theCase = new Case("CA-H510B-B1", "NZXT", di, "Aluminum", "Balck", 381);
		Monitor theMonitor = new Monitor("VG245H", "ASUS", 24, new Resolution(1920,1080));
		Motherboard theMotherboard = new Motherboard("ASUS", "STRIX Z490-E GAMING", "ROG", "LGA 1200", 128, true);
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		thePC.getTheCase().powerOn();
		thePC.getMotherboard().boot();
		thePC.getMonitor().drawPixelAt(88, 510, "Green");
		
		
		

	}

}
