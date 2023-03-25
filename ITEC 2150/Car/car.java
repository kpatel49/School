package Car;

public class car {

	//size
	//capacity
	//speed
	//crate three instance variable 
	
	private String size;
	private int capacity;
	private int speed;
	
	public car(String size, int capacity, int speed) {
		this.size = size;
		this.capacity = capacity;
		this.speed = speed;
	}
		
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}	

	@Override
	public String toString() {
		return "car [size=" + size + ", capacity=" + capacity + ", speed=" + speed + "]";
	}
	
	
	public void unload() {
		
	}
	
	
}
