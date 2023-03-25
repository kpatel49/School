package Animal2;

public class Animal {
	int age;
	String gender;
	int weight;
	
//	public Animal() {
//		this(0,"Female",0);
//	}

	public Animal(int age, String gender, int weight) {
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void eat() {
		System.out.println(" Eating ..");
	}

	public void sleep() {
		System.out.println(" ... sleeping ");
	}

}
