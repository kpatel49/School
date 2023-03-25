package Final;

class Car {


	// Complete this class so that the Output 1 shows “My car is a car.” (5 points)

	 public String carType() {
		 return "car";
	 }

	 

	}


class SportsCar extends Car {
	    public String carType() {
	        return "sports car";
	    }
	}

interface LuxuryCar {
	    default String carType() {
	        return "luxury ";
	    }
	}


	// Create DreamCar class here (5 points)

class DreamCar extends SportsCar implements LuxuryCar{
	
	public String carType() {
		return "luxury " + super.carType();
	}
}	 

	 

	 



class CarTester {

	    public static String carType(Car c) {
	        return c.carType();
	    }

	    public static void main(String[] args) {

	        Car myCar = new Car();
	        Car momsCar = new SportsCar();
	        SportsCar dadsCar = new SportsCar();
	        DreamCar myDreamCar = new DreamCar();

	        System.out.println("My car is a " + carType(myCar) + "."); // <== Output1
	        System.out.println("Mom's car is a " + carType(momsCar) + "."); // <== Output2
	        System.out.println("Dad's car is a " + carType(dadsCar) + "."); // <== Output3
	        System.out.println("My dream car is a " + carType(myDreamCar) + "."); // <= Output4
	    }
	}