package EarBuds;

public class AirpodPro extends Buds{

    private boolean noiseCancellation;

    public AirpodPro(int volumeLevel, boolean on, boolean noiseCancellation) {
        super(volumeLevel, on);
        this.noiseCancellation = noiseCancellation;
    }

    public void noiseCancellationOn(){
        noiseCancellation = true;
    }

    public void noiseCancellationOff(){
        noiseCancellation = false;
    }

    public void callSiri(){
        System.out.println("Hey Siri!!!");
    }

    @Override
    public String toString(){
        return super.toString() + ", noise cancellation feature: " + noiseCancellation;
    }
}

