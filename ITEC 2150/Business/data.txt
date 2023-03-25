package Computer;

/**
 * ASUS - 24" LED FHD FreeSync Monitor - Black
 * use this example from bestbuy.com/site/asus-24-led-fhd-freesync-monitor-black/5591926.p?skuId=5591926
 */
public class Monitor {

    private String model;
    private String manufacturer;
    private int screenSize;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int screenSize, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
    
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "  + x + ", " + y + " in color " + color);
    }
}
