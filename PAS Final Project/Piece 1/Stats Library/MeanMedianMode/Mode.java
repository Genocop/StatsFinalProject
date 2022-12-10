public class Mode {
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

