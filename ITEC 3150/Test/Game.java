

import java.io.Serializable;

/**
 * Class: Game
 * 
 * @author Dr. Johnson
 * @version 1.0 Course : ITEC 3150, Fall, 2018 Written: September 02, 2015
 * 
 * 
 *          This class � This class describes the common attributes and methods
 *          of the Game being collected into an inventory
 * 
 *          Purpose: � This class is intended to serve a parent class only for
 *          all different types of Game
 *
 */
public class Game implements Serializable
{
    private int idNumber;
    private int numCopies;
    private String itemName;
    private String type;

    /**
     * Method:Game ()
     * 
     * Constructor method that accepts values for all the attributes and sets
     * them.
     * 
     * @param idNumber
     * @param itemName
     * @param type
     * @param numCopies
     */
    public Game(int idNumber, String itemName, String type, int numCopies)
    {
        this.idNumber = idNumber;
        this.itemName = itemName;
        this.type = type;
        this.numCopies = numCopies;
    }

    public int getNumCopies()
    {
        return numCopies;
    }

    /**
     * Method:getIdNumber() Getter method for the idNumber attribute
     * 
     * @return the idNumber
     */
    public int getIdNumber()
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

    /**
     * Method:toString()
     * 
     * Converts attributes of class to a String
     * 
     * @return String
     */
    @Override
    public String toString()
    {
        return "Game [idNumber=" + idNumber + ", numCopies=" + numCopies
                + ", itemName=" + itemName + ", type=" + type + "]";
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
