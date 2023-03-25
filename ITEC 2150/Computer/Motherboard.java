package Computer;

public class Motherboard {

	private String brand;
	private String model;
	private String series;
	private String cpuSocketType;
	private int maxMemory;
	private boolean dual;

	public Motherboard(String brand, String model, String series, String cpuSocketType, int maxMemory, boolean dual) {
		this.brand = brand;
		this.model = model;
		this.series = series;
		this.cpuSocketType = cpuSocketType;
		this.maxMemory = maxMemory;
		this.dual = dual;
	}

	public void boot() {
		System.out.println("The system is booting now... ");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getCpuSocketType() {
		return cpuSocketType;
	}

	public void setCpuSocketType(String cpuSocketType) {
		this.cpuSocketType = cpuSocketType;
	}

	public int getMaxMemory() {
		return maxMemory;
	}

	public void setMaxMemory(int maxMemory) {
		this.maxMemory = maxMemory;
	}

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

}
