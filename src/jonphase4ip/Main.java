package jonphase4ip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Jon Janet 7/15/2011
 * class Main calls classes Reader and Writer to read lines from a text file,
 * replace the word "the" with the word "JAVAJAVA", then change all
 * characters to upper case before writing each line to a different text file
 * named "outfile.txt" it then prints the absolute path of the output file
 * to the screen.
 */
public class Main
{

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Writer writer = new Writer(new File("resident.DAT"));
        Reader reader = new Reader(new File("resident.csv"), writer);
        reader.redactor();
        File ap = new File("resident.DAT");
        System.out.println("The absolute path of the new file is: " + ap.getAbsolutePath());
    }
}
