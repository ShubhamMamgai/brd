package nucleus;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException, ParseException {

        validation vl=new validation();
        FileReader fr=new FileReader("testcase1.txt");
        BufferedReader br=new BufferedReader(fr);
        String s;
        String[] word;
        while ((s=br.readLine())!=null)
        {
            word=s.split("~");
            vl.eligibilty(word);
//           db.connecting_Database(word);

        }
    }
}
