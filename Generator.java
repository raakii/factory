import java.util.*;

public class Generator { 
    static void permutation(int x, String[] arr)
    {
        String[] ml = arr;
        int count = ml.length;
        for( int z=0; z<x-1; z++)
        {
            Vector<String> tmp = new Vector<String>();
            for(int i=0; i<arr.length; i++)
            {
                for(int k=0; k<ml.length; k++)
                {
                    tmp.add(ml[k] + arr[i]);
                    count+=1;
                }
            }
        }

        for(int i=0; i<tmp.size(); i++)
        {
            System.out.print(tmp.get(i) + " ");
        }
        ml = tmp.toArray(new String[tmp.size()]);;
    }
}

public static void main(String[] args)
{
    String[] arr = {"a", "b","c", "d", "e"};
    int x=5;
    permutation(x,arr);
}
}