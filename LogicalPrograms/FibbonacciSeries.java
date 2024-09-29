package LogicalPrograms;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, i, n;

		a = 0;
		b = 1;
		n = 5;
		
		System.out.print(a + " " + b);

		for (i = 0; i < n; i++) {

			c = a + b;
			System.out.print(" " + c);

			a = b;
			b = c;
		}
		}
	}


