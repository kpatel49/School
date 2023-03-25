package Point;

public class PointTester {

	public static void main(String[] args) {
	NamedPoint pointA = new NamedPoint(0,0,"Origin of 0");
		System.out.println("pointA: " + pointA);
		System.out.println("pointA.getName() " + pointA.getName());
		
		System.out.println("pointA.getX() " + pointA.getX());
		System.out.println(pointA.toString());
		
	}

}
