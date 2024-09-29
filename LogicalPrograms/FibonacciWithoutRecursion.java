package LogicalPrograms;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c, i, count = 5;

		System.out.print(a + " " + b);

		for (i = 0; i < count; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
