package ExceptionHandlingDemo;

public class TestCircleWithException {
    public static void main(String[] args) {
    	
    	try {
    		CircleWithException c1 = new CircleWithException(-9);
    	}
    	catch(IllegalArgumentException ex) {
    		System.out.println(ex);
    	}
    	try {
    		CircleWithException c1 = new CircleWithException(10);
    	}
    	catch(IllegalArgumentException ex) {
    		System.out.println(ex);
    	}
    	finally {
    		System.out.println("All exception are handled...");
    	}
    	System.out.println("Number of objects created: " +
              CircleWithException.getNumberOfObjects());
//        try {
//            CircleWithException c1 = new CircleWithException(5);
//            CircleWithException c2 = new CircleWithException(-5);
//            CircleWithException c3 = new CircleWithException(0);
//        }
//        catch (IllegalArgumentException ex) {
//            System.out.println(ex);
//        }
//
//        System.out.println("Number of objects created: " +
//                CircleWithException.getNumberOfObjects());

    }
}