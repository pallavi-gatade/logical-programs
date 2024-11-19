package LogicalPrograms;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		
		int num = 123456789;
		int even_num = 0 , odd_num = 0;
		
		while(num > 0) {
			
			int rem = num % 10;
			if(rem % 2 == 0) 
				even_num++;
			else
				odd_num++;
			
			num = num/10;
		}
		
		System.out.println("Even number count is :" + even_num);
		System.out.println("Odd number count is :" + odd_num);
	}
	
}
