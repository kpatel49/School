package ExceptionHandlingDemo;

public class CircleWithException {
    /** The radius of the circle */
    private double radius;

    /** The number of the objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithException() {
        this(1.0);
    }

    /** Construct a circle with a specified radius */
    public CircleWithException(double newRadius) {
        setRadius(newRadius); //because this setRadius is throws IllegalArgument exception
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    //setRadius method throws an exception if the radius is negative. in this case,  the setRadius method throws
    // an IllegalArgumentException if the argument newRadius is negative

    /**
     * Throws is a keyword used to indicate that this method could throw this type of exception.
     * The caller has to handle the exception using a try-catch block or propagate the exception.
     * We can throw either checked or unchecked exceptions.
     *
     * The throws keyword allows the compiler to help you write code that handles this type of error,
     * but it does not prevent the abnormal termination of the program. With the help of the throws keyword,
     * we can provide information to the caller of the method about the types of exceptions the method might throw.
     * @param newRadius
     */

    //public void setRadius(double newRadius) {  //declare exception
    public void setRadius(double newRadius) throws IllegalArgumentException {  //declare exception
        if (newRadius >= 0)
            radius =  newRadius;
        else
            throw new IllegalArgumentException(  //throw exception
                    "Radius cannot be negative");
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}