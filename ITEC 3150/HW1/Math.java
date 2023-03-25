

public class Math extends Course{
	
	private boolean STEM;
	private String Component;
	
	public Math(String catagory, String name, int CRN, boolean sTEM, String component) {
		super(catagory, name, CRN);
		this.STEM = sTEM;
		this.Component = component;
	}
	
	public boolean isSTEM() {
		return STEM;
	}

	public String getComponent() {
		return Component;
	}

	@Override
	public String toString() {
		return super.toString() + " Math [STEM=" + STEM + ", Component=" + Component + "]";
	}
	

}
