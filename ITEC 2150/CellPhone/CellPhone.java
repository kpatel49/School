package CellPhone;

public class CellPhone implements ICell {

	/*
	 * public void ring();
	 *  public void text(); 
	 *  public void alarm();
	 *   public boolean
	 * cameraMotionDectect();//if the camera has motion detect or not public void
	 * powerOn(); 
	 * public void powerOff(); 
	 * public void passwordLock();
	 */
	@Override
	public void ring() {
		System.out.println("Phone is ringing.. ");
	}
	@Override
	public void text() {
		System.out.println("text message is created ... ");
	}
	@Override
	public void alarm() {
		System.out.println("alarm is ringing.. ");
	}
	@Override
	public boolean cameraMotionDectect() {
		return true;
	}
	@Override
	public void powerOff() {
		System.out.println("power is off ");
	}
	@Override
	public void powerOn() {
		System.out.println("power is on ");
	}
	
	@Override
	public void passwordLock() {
		System.out.println("password is locked. ");
	}

}
