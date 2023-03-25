package EarBuds;

public class Buds {
    int volumeLevel = 0;
    boolean on; //default value is false

    public Buds(){
        this(0,false);
    }

    public Buds(int volumeLevel, boolean on) {
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn(){
        on = true;
        System.out.println("Earbuds are turned on.");
    }

    public void turnOff(){
       on = false;
        System.out.println("Earbuds are turned off");
    }

    public void setVolume(int newVolume){
        if(on == true && newVolume >= 0 && newVolume <= 100){
            volumeLevel = newVolume;
        }
    }

    public void volumeUp(){
        if(on == true && volumeLevel < 100 && volumeLevel >= 0){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if(on == true && volumeLevel <= 100 && volumeLevel >= 1){
            volumeLevel--;
        }
    }

    @Override
    public String toString() {
        return "Buds [" +
                "volumeLevel: " + volumeLevel +
                ", power on: " + on +
                ']';
    }
}
