package jonphase4ip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jon Janet 7/15/2011
 * Class Reader creates new instances of BufferedReader and Writer and uses
 * BufferedReader to read lines of text, then changes them to lower case,
 * replaces the word "the" with the "JAVAJAVA", then calls writer to write the
 * lines out in all caps
 */
public class Reader
{
    private BufferedReader br;
    private Writer writer;

    /**
     * constructor Reader creates new instances of BufferedReader and Writer
     * @param input
     * @param writer
     * @throws FileNotFoundException
     */
    public Reader(File input, Writer writer) throws FileNotFoundException
    {
      br = new BufferedReader(new FileReader(input));
      this.writer = writer;
    }

    /**
     * method redactor uses BufferedReader to read lines of text, then changes them to
     * lower case, replaces the word "the" with "JAVAJAVA", then calls writer to
     * write the lines out in all caps
     * @throws IOException
     */
    public void redactor() throws IOException
    {
        String Line, output;
        String find = ",";
        String replace = "|";

        while ((Line = br.readLine()) != null)
        {
           Line = Line.toLowerCase();
           output = Line.replaceAll(find, replace);
           writer.writeNew(output);
        }
           writer.close();
    }
}
