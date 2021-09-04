package userInput;
import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        int t = sc.nextInt();
//        float r = sc.nextFloat();
//        float i = (p*r*t)/100;
//        System.out.println("simple interest is " + i);
        int age = sc.nextInt();
        int weight = sc.nextInt();
        float bmi = (age*weight)/100;
        System.out.println("Your BMI is "+bmi);
        if (bmi <= 40) {
        	System.out.println("your bmi is normal.");
        }else {
        	System.out.println("your bmi is not normal.");
        }
	}

}
