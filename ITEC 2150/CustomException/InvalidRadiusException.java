package CustomException;

public class InvalidRadiusException extends Exception{
    
    private double radius;
    
    public InvalidRadiusException(double newRadius){
        this.radius = newRadius;
    }
    
    public double getRadius(){
        return radius; 
    }
    
}
