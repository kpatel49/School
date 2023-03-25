package EarBuds;

public class EchoBuds extends AirpodPro{

    private String color;
    private boolean assistant;

    public EchoBuds(int volumeLevel, boolean on, boolean noiseCancellation, String color, boolean assistant) {
        super(volumeLevel, on, noiseCancellation);
        this.color = color;
        this.assistant = assistant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAssistant() {
        return assistant;
    }

    public void setAssistant(boolean assistant) {
        this.assistant = assistant;
    }

    public void callAlexa(){
        System.out.println("Alexa!!");
    }

    @Override
    public String toString(){
        return super.toString() + ", color: " + color + ", voice assistant: " + assistant;
    }
}
