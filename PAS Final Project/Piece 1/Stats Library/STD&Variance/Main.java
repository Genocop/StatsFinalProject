import java.io.*;
//Source: https://www.geeksforgeeks.org/program-for-variance-and-standard-deviation-of-an-array/
public class Main
{
 
    // Calculating variance
    public double variance(double a[],int n)
    {
        // Compute mean 
        double sum = 0;
      
        for (int i = 0; i < n; i++)
            sum += a[i];
        double mean = (double)sum /(double)n;
     
        // Compute sum squared differences with mean.
        double sqDiff = 0;
        for (int i = 0; i < n; i++)
            sqDiff += (a[i] - mean) * (a[i] - mean);
        
        return (double)sqDiff / n;
    }
    //Compute STD by taking square root of variance
    public double standardDeviation(double arr[],int n)
    {
        return Math.sqrt(variance(arr, n));
    }
}