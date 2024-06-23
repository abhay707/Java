import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        
        File obj = new File("file1.txt");
        try{
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
