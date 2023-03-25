package CloneDemo;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
	private int id;
	private double area;
	private Date whenBuilt;

	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}

	// getters only
	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public Date getWhenBuilt() {
		return whenBuilt;
	}

	/*
	 * this is called a shallow copy if the filed/data is primitive type as you see
	 * above Like id or the area, when this method is called, this data is going to
	 * be saved. For example, if you crate an object of the house1 or house2, if you
	 * are using cloneShallow(), then it is going to clone the primitive type data.
	 * if the data is an object or instance, the reference variable
	 * 
	 */

	public Object cloneShallow() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	// deep copy

	/*
	 * this clone() method is defined in the Object class and this clone() method is
	 * strengthen its accessibility For example, if the House class did not override
	 * the clone() or if this House class did not implement Cloneable, then when you
	 * run this program, you will get the error message because this is part of the
	 * checked exception which mean it is protected in Object class. So When you
	 * create a House type object, by cloning the object, you must cast by the
	 * Concrete type in this class, House type. House houseClone = (House)new
	 * House.clone(); because clone() is not visible.
	 * 
	 * @return
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		//this House type houseClone object is a shallow copy
		House houseClone = (House) super.clone(); // clone() is invoked and then cast the returned Object to House Type
		/*
		 * house1 and house2 house.whenBuilt == house2.whenBuilt; true
		 * house1 == house2 --> false
		 * */		
		houseClone.whenBuilt = (Date) (whenBuilt.clone());
		return houseClone;
	}

//deep copy
	public Object cloneDeep2() {

		House houseClone = new House(id, area);//shallow copy

		houseClone.whenBuilt = new Date();//deep copy
		houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
		return houseClone;
	}

	@Override
	public int compareTo(House o) {
		if (this.area > o.area) {
			return 1;
		} else if (this.area < o.area) {
			return -1;
		} else
			return 0;
	}

}
