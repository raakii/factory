import java.io.*;
import java.util.*;

interface Cracker  {

    public void CrackPassword(User user);
   
}

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


class BruteForceCracker implements Cracker {

    public void CrackPassword(User user){
      // Given array
    String []arr = { "a", "b", "c","d","e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v","w", "x", "y", "z"};
      String[] ml = arr;
    // Given X
    int X = 12;  
    int attempts=0, count = ml.length;
    String pwd = "";

    // Traverse all possible lengths
    for(int z = 4; z < X - 1; z++)
    {
         
        // Stores all combinations
        // of length z
        Vector<String> tmp = new Vector<String>();
           
        // Traverse the array
        for(int i = 0; i < arr.length; i++)
        {
            for(int k = 0; k < ml.length; k++)
            {
            
                     
                    // Generate all
                    // combinations of length z
                    tmp.add(ml[k] + arr[i]);
                    count += 1;
            }
        }                
                   
        // Print all combinations of length z
        for(int i = 0; i < tmp.size(); i++)
        {
            System.out.println(tmp.get(i) + " ");
            attempts++;
            pwd = tmp.get(i);
             if(user.authentificate(pwd))
                    {
                        System.out.println("Password suucessfully hacked in " +  attempts + " attempts  ! :" + pwd);
                        return;
                    }
        }
           
        // Replace all combinations of length z - 1
        // with all combinations of length z
        ml = tmp.toArray(new String[tmp.size()]);;
    }
}
}