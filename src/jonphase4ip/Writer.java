package jonphase4ip;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jon Janet 7/15/2011
 * class Writer creates a new instance of BufferedWriter,changes lines of text to
 * upper case, writes them then closes BufferedWriter
 */
public class Writer
{
    private BufferedWriter bw;
    

    /**
     * constructor Writer creates a new instance of BufferedWriter
     * @param output
     * @throws IOException
     */
    public Writer(File output) throws IOException
    {
        bw = new BufferedWriter (new FileWriter(output));        
    }

    /**
     * method writeNew changes lines of text to upper case then writes them
     * @param Line
     * @throws IOException
     */
    public void writeNew(String Line) throws IOException
    {       
        bw.write(Line);
        bw.newLine();
    }

    /**
     * method close closes bufferedWriter
     * @throws IOException
     */
    public void close() throws IOException
    {
        bw.close();
    }
}
