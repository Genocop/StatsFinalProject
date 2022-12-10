import java.util.Scanner;

public class tester {

	
	public static void main(String[] args) {
		Main test = new Main();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the value of n?(number of trials)");
		double n = scanner.nextDouble();
		

		System.out.println("What is the value of p?");
		double p = scanner.nextDouble();
		
		System.out.println("What is the value of y?");
		double y = scanner.nextDouble();
		
		System.out.println(test.binomialDistribution( n, y, p));

	}

}

