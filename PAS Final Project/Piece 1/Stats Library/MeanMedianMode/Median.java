import java.util.Arrays;

public class Median {
    public double computeMedian(double[] list, int length) {
        Arrays.sort(list);
        
        int center = list.length/2;
        if (list.length % 2 == 1) {
            return list[center];
        } else {
            return (list[center - 1] + list[center]) / 2.0;
        }
  
    }
}