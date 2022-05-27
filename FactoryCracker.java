import java.io.*;
import java.util.*;

class FactoryCracker {
    public static Cracker getInstance(int x)  {
        Cracker cracker = null;
    if(x==1) {
        cracker = new BruteForceCracker();
    }
    else if(x==2) {
        cracker = new DictionaryCracker();
    }
    else {
        System.out.println("There is no other option");
    }
    return cracker;
    }
}