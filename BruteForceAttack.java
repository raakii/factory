// Java program for the above approach
import java.util.*;
class BruteForceAttack
{
 
// Function to generate permutations of
// at most X elements from array arr[]
static void permutations(int X, String[] arr)
{
    String[] ml = arr;
    int attempts=0, count = ml.length;
    String realPwd, String pwd = "";

    System.out.println("Enter a password");
            Scanner sc = new Scanner(System.in);
            realPwd = sc.nextLine();
   
    // Traverse all possible lengths
    for(int z = 0; z < X - 1; z++)
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
             if(pwd.equals(realPwd))
                    {
                        System.out.println("Password suucessfully hacked in " +  attempts + " attempts  ! :" + realPwd);
                        return;
                    }
        }
           
        // Replace all combinations of length z - 1
        // with all combinations of length z
        ml = tmp.toArray(new String[tmp.size()]);;
    }
}
 
// Driver Code
public static void main(String[] args)
{
     
    // Given array
    String []arr = { "a", "b", "c","d","e"};
     
    // Given X
    int X = 5;     
    permutations(X, arr);  
}
}
 
// This code is contributed by shikhasingrajput