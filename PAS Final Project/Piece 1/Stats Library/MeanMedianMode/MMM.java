import java.awt.List;
import java.util.Arrays;

public class MMM {
    public double computeMean(double[] list) {
        double total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        return (total / list.length);
    }
    
    public double computeMedian(double[] list, int length) {
        Arrays.sort(list);
        
        int center = list.length/2;
        if (list.length % 2 == 1) {
            return list[center];
        } else {
            return (list[center - 1] + list[center]) / 2.0;
        }
  
    }
    
    
    public double computeMode(double list[], int number) {
		
		double max = 0;
		int counter = 0;
		
		for (int i = 0; i < number; i++) {
			int count = 0;
			for (int j = 0; j < number; j++) {
				if(list[j] == list[i])
					count++;
			}
			
			if (count > counter) {
				counter = count;
				max = list[i];
			}
			
		}
		return max;
	}
}
