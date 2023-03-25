package MyBedroom;

public class Bed {
	
	private String style;
	private int pillow;
	private int height;
	private int sheets;
	private int quilt;
	public Bed(String style, int pillow, int height, int sheets, int quilt) {
		this.style = style;
		this.pillow = pillow;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	
	public void make() {
		System.out.println("This is form Bed class --> making bed...");
	}
	
	
	

}
