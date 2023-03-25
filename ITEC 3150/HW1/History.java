

public class History extends Course{
	
	private boolean area;
	private boolean recorded;
	private String component;
	
	public History(String catagory, String name, int CRN, boolean area, boolean recorded, String component) {
		super(catagory, name, CRN);
		this.area = area;
		this.recorded = recorded;
		this.component = component;
	}
	
	public boolean isArea() {
		return area;
	}
	public boolean isRecorded() {
		return recorded;
	}

	public String getComponent() {
		return component;
	}

	@Override
	public String toString() {
		return super.toString() + " History [area=" + area + ", recorded=" + recorded + ", component=" + component + "]";
	}
	
	
	
}
