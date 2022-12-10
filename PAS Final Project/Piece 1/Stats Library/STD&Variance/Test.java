
import java.util.Scanner;

public class Test {
    
    public static void main (String[] args)
    {
        
        double arr[] = {150.0, 300.0, 95.0, 6.0, 555.0};
        int n = arr.length;
     
        System.out.println( "Variance: " + variance(arr, n)); 
        System.out.println ("Standard Deviation: " + standardDeviation(arr, n));
     
    }
}


