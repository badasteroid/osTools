/**
 * Created by andrea on 18/12/15.
 */
import java.io.File;
public class rename {

        public static void main(String[] a) {
            File file = new File("c:\\text.txt");
            file.renameTo(new File("c:\\text.txt.bak"));
        }
    }
