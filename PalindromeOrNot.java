package assessment3.nov16;

public class PalindromeOrNot {

       public static void main(String arg[]) {
    	   
    	   int number = 1241;
    	   int num = number;
    	   
    	   int rev = 0;
    	   
    		while(number != 0) {
    			rev = rev * 10 + number % 10;
    			number = number/10;
    			
    		}
    		
    		if(num == rev)
    			System.out.println("Given Number is Palindrom ");
    		else
    			System.out.println("Given Number is Not Palindrom ");
    		
       }
}
