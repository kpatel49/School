package MockTest;

/**
 * once you complete this programs (1), (2), (3), output must be
 *
 * "Unknown Person 2020 3.4 64.0 1 Candidate"
 */
class A {
	private String name;
	private int bindingYear;

	public A() {

	}

	public String getName() {
		return name;
	}

	public int getBindingYear() {
		return bindingYear;
	}

	public void setName(String name) {
		try {
			if (name.length() > 0) {
				this.name = name;
			}
		} catch (NullPointerException e) {
			System.out.println("What is this " + e + "?");
		} finally {
			System.out.print("");
		}
	}

	public void setBindingYear(int bindingYear) {
		this.bindingYear = bindingYear;
	}

	public String toString() {
		return (name + " " + bindingYear);
	}
}

class B extends A {
	private double gpa;
	private double accCredit;

	public B(String name, int bindingYear, double myGpa, double myAccCredit) {

		// (1) Complete here ///////////////////////////
		super.setName(name);
		super.setBindingYear(bindingYear);
		this.gpa = myGpa;
		this.accCredit = myAccCredit;

	}

	public double getGPA() {
		return gpa;
	}

	public double getAccCredit() {
		return accCredit;
	}

	public void setGPA(double myGPA) {
		gpa = myGPA;
	}

	public void setAccCredit(double myAccCredit) {
		accCredit = myAccCredit;
	}

	public String toString() {
		return super.toString() + " " + " " + gpa + " " + accCredit;
	}
}

class C extends B {

	private int d;
	private String e;

	public C(String name, int bindingYear, double myGpa, double myAccCredit, int d, String e) {
		// (2) COMPLETE HERE ///////////////////////////
		super(name, bindingYear, myGpa, myAccCredit);
		this.d = d;
		this.e = e;

	}

	public String toString() {
		// (3) COMPLETE HERE /////////////////////////
		return super.toString() + " " + d + " " + e;
	}

}

class Driver {
	public static void main(String[] args) {
		C a = new C("Unknown Person", 2020, 3.4, 64, 1, "Candidate");
		System.out.println(a);
		
		a.setName(null);
		
	}
}