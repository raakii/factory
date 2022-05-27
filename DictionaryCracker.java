import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class DictionaryCracker implements Cracker  {
    public void CrackPassword(User user)  {
        int count = 0;
        try {
            File myFile = new File("dico2.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String password = myReader.nextLine();
                System.out.println(password);
                count++;
                if(user.authentificate(password)) {
                    System.out.println("Password hacked successfully in " + count + " attempts : " + password);
                    myReader.close();
                    return;
                }
            }
            System.out.println("Password not foud");
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
