import java.util.Scanner;

public class Test {

	public static void main (String[] args) {
		CP test = new CP();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("n value? ");
		int n = scanner.nextInt();
		System.out.println("r value? ");
		int r = scanner.nextInt();
		
		System.out.println(test.factorial(n));
		System.out.println("Combination Result: " + test.combinations(n, r));
		System.out.println("Permutation Result: " + test.permutations(n, r));
	}
}

