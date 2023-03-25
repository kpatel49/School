
/**
 * Class: Media
 * 
 * @author Dr. Johnson
 * @version 1.0 Course : ITEC 3150, Fall, 2015 Written: January 18, 2012
 * 
 * 
 *          This class � This class describes the common attributes and methods
 *          of the media being collected into a library
 * 
 *          Purpose: � This class is intended to serve a parent class only for
 *          all different types of media
 *
 */
public class Media
{
    private String idNumber;
    private String itemName;
    private String type;

    /**
     * Method:Media ()
     * 
     * Constructor method that accepts values for all the attributes and sets
     * them.
     * 
     * @param idNumber
     * @param itemName
     * @param type
     */
    public Media(String idNumber, String itemName, String type)
    {
        this.idNumber = idNumber;
        this.itemName = itemName;
        this.type = type;
    }

    /**
     * Method:getIdNumber() Getter method for the idNumber attribute
     * 
     * @return the idNumber
     */
    public String getIdNumber()
    {
        return idNumber;
    }

    /**
     * Method:getItemName() Getter method for the itemName attribute
     * 
     * @return the itemName
     */
    public String getItemName()
    {
        return itemName;
    }

    /*
     * Method:toString() Converts the attributes of the class to a text readable
     * format.
     * 
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Media [idNumber=" + idNumber + ", itemName=" + itemName + ", type=" + type + "]";
    }

    /**
     * Method:getItemName() Getter method for the itemName attribute
     * 
     * @return the type
     */
    public String getType()
    {
        return type;
    }

}
