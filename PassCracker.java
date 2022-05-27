import java.util.*;
import java.io.*;

public class PassCracker {

    public static void main(String[] args) {
        //public void CrackPassword()  {
        FactoryCracker factoryCracker = new FactoryCracker();

        Scanner sc = new Scanner(System.in);

        User user = new User();

        System.out.println("Welcome! Let's process to your registration.");
        System.out.println("Please enter your login");
        String login = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        user.SetLogin(login);
        user.SetPassword(password);

        System.out.println("How do you want to crack your password? Enter 1 for bruteForce or 2 for dictionary");
        int x = sc.nextInt();
        if(x==1)
        {
            Cracker bruteForce = factoryCracker.getInstance(1);
            long start = System.currentTimeMillis();
            bruteForce.CrackPassword(user);
            
            long end = System.currentTimeMillis();
            System.out.println("it tooks "+ (end-start)+ " milliseconds");
        }
         if(x==2)
        {
            Cracker dictionary = factoryCracker.getInstance(2);
            long start = System.currentTimeMillis();
            dictionary.CrackPassword(user);
            long end = System.currentTimeMillis();
            System.out.println("it tooks "+ (end-start)+ " milliseconds");
        }
    //}
    }
}