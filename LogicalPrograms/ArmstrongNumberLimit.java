package LogicalPrograms;

public class ArmstrongNumberLimit {

	static boolean isArmstrong(int n) {

		int temp, digits = 0, last = 0, sum = 0;

		temp = n;
//loop execute until the condition becomes false  
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {

			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}

		if (n == sum)

			return true;
		else
			return false;
	}


	public static void main(String args[]) {
		int num;
//		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit: ");

		num = 999; // sc.nextInt();
		System.out.println("Armstrong Number up to " + num + " are: ");
		for (int i = 0; i <= num; i++)
			if (isArmstrong(i))

				System.out.print(i + ", ");
	}
}