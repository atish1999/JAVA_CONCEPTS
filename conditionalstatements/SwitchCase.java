package conditionalstatements;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		 System.out.println("enter first number");
	        float a = x.nextFloat();
	        System.out.println("enter second number");
	        float b = x.nextFloat();
	        System.out.println("enter the operation.");
	        x.nextLine();
	        char operation = x.nextLine().charAt(0);
	        float result = 0;
	        switch(operation) {
	        case '+':
	        	result = a + b;
	        	break;
	        case '-':
	        	result = a-b;
	        	break;
	        case '*':
	        	result = a*b;
	        	break;
	        case '/':
	        	result = a/b;
	        	break;
	        case '%':
	        	result = a % b;
	        	
	        default:
	        	System.out.println("Invalid Operation."); 
	        }
	        System.out.println("the result is "+result);

	}

}
