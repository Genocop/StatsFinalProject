    import java.util.Scanner;
    import java.lang.Math;
    
    public class Main {
        private double y;
        private double function;
        private double n;
        
            public double factorial(double n) {
            
            int f = 1, j = 1;
            while (j <= n) {
                f = f * j;
                j++;
            }
            return f;
        }

		public double combinations(double n, double r) { //n! / (n-r)!
		double result = ((factorial(n)) / (factorial(r) * factorial(n-r)));
		
		return result;
	}

        
	public double binomialDistribution(double n, double y, double p) {
		double combination = combinations(n,y);
		
		double function = combination * ((Math.pow(p, y)*(Math.pow(p - 1, n - y))));
	
		
		
		return function;
		
		
		
	}
}

