package conditionalstatements;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age >= 18) {
//        	System.out.println("you can vote now.");
//        }else {
//        	System.out.println("you can not vote now.");
//        }
//		int noOfPetals = sc.nextInt();
//		if(noOfPetals % 2 == 0) {
//		    System.out.println("he loves me not");
//		}else {
//			System.out.println("he loves me.");
//		}
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = 0;
//        z = x > y ? x : x ==y ? x : y;
        if (x > y) {
            z = x;
        }else {
        	z = y;
        }
        System.out.println("maximum of both numbers "+ z);
        

	}

}
