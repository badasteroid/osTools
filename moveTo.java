/**
 * Created by andrea on 18/12/15.
 */
import java.io.File;
public class moveTo {


        public static void main(String[] args)
        {
            try{

                File afile =new File("C:\\folderA\\Afile.txt");

                if(afile.renameTo(new File("C:\\folderB\\" + afile.getName()))){
                    System.out.println("File is moved successful!");
                }else{
                    System.out.println("File is failed to move!");
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
