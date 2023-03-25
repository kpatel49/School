

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 
 * Question 4 file for midterm exam.
 * 
 * @author cjohns25
 *
 */
public class WriteGame
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList<Game> gList = new ArrayList<Game>();

        Game g = new Game(1, "Monopoly", "board", 1);
        gList.add(g);
        g = new Game(2, "Cubis", "pc", 2);
        gList.add(g);
        g = new Game(3, "QBert", "atari", 6);
        gList.add(g);

        // open an ObjectOutputStream for writing
        try ( // Create an output stream for file object.dat
        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("games.dat"));)
        {

            for (Game game : gList)
            {
                output.writeObject(game);
            }
            output.close();

        } catch (FileNotFoundException e)
        {

            e.printStackTrace();
        } catch (IOException e)
        {

            e.printStackTrace();
        }

    }

}
