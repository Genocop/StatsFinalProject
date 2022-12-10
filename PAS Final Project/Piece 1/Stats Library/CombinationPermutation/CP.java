public class CP {
	int n = 0;

	public int combinations(int n, int r) { //n! / (n-r)!
		int result = ((factorial(n)) / (factorial(r) * factorial(n-r)));
		
		return result;
	}

	public int permutations(int n, int r) { //n! / r!(n-r)!
		int result = factorial(n) / (factorial(n-r));

		return result;
	}

	public int factorial(int n) {
		
		int f = 1, j = 1;
		while (j <= n) {
			f = f * j;
			j++;
		}
		return f;
	}

}

