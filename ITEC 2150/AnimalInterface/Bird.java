package AnimalInterface;

public class Bird extends AnimalI {
    
    private double wingSpan;
    private double height;

    public Bird(int age, String gender, int weight, double wingSpan, double height) {
        super(age, gender, weight);
        this.wingSpan = wingSpan;
        this.height = height;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public void eat() {       
        super.eat(); 
    } 
    
    
    @Override
    public void sleep(){
        super.sleep();
    }
    
//    public void fly(){
//        System.out.println(" can fly for a long time... ");
//    }
    
    
}
