import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DictionaryCracker  {
    public static void main(String[] args)  {
        String realPwd;
        int count = 0;
        try {
            File myFile = new File("file.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String password = myReader.nextLine();
                count++;
                if(realPwd.equals(password)) {
                    System.out.println("Password hacked successfully in " + count + "attempts");
                }
            }
            if(myReader.hasNextLine()) {
                System.out.println("Password not foud");
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}