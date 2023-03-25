

/**
 * ITEC 3150 - Text File I/O Example Person Class - This is the object we will
 * read and write to file
 * 
 * @author cjohns25
 * 
 */
public class Person
{
	public String firstName;
	public String lastName;
	public int idNum;
	public String city;
	
	/**
    *  Default constructor used to create empty attributes
    */
   public Person()
   {
   	firstName = "";
   	lastName = "";
   	idNum =0;
   	city ="";
   }

	/**
    * @param firstName
    * @param lastName
    * @param idNum
    * @param city
    */
   public Person(String firstName, String lastName, int idNum, String city)
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.idNum = idNum;
	   this.city = city;
   }

	/* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
	   return "Person [firstName=" + firstName + ", lastName=" + lastName
	         + ", idNum=" + idNum + ", city=" + city + "]";
   }

	/**
    * @return the firstName
    */
   public String getFirstName()
   {
   	return firstName;
   }

	/**
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName)
   {
   	this.firstName = firstName;
   }

	/**
    * @return the lastName
    */
   public String getLastName()
   {
   	return lastName;
   }

	/**
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName)
   {
   	this.lastName = lastName;
   }

	/**
    * @return the idNum
    */
   public int getIdNum()
   {
   	return idNum;
   }

	/**
    * @param idNum the idNum to set
    */
   public void setIdNum(int idNum)
   {
   	this.idNum = idNum;
   }

	/**
    * @return the city
    */
   public String getCity()
   {
   	return city;
   }

	/**
    * @param city the city to set
    */
   public void setCity(String city)
   {
   	this.city = city;
   }

}
