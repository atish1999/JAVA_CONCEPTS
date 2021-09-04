package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n= sc.nextInt();
			int temp=n;
			int result =0;
			while(temp!=0) {
				int lastDigit =temp%10;
				result+=lastDigit;
				temp/=10;
				System.out.println(lastDigit+" "+temp+" "+result);
			}	
			System.out.println("the sum of the digits would be "+ result);
		
//		int n =sc.nextInt();
//		int temp =n;
//		int result =0;
//		if(n<0) {
//			temp=-n;
//		}
//		int digit=(int)Math.log10(temp)+1;
//		System.out.println(digit);
//		for(int i=1; i<=digit;i++) {
//			int lastDigit = temp%10;
//			result+=lastDigit;
//			temp/=10;
//			System.out.println(lastDigit+" "+temp+" "+result);
//		}
//		System.out.println("sum of the digits would be "+ result);

	}

}
