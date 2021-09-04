package rough;

import java.util.Scanner;

public class Rough1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n,armstrong =0;
		while(temp!=0) {
			int lastDigit=temp%10;
			int cube = (lastDigit)*(lastDigit)*(lastDigit);
			armstrong+=cube;
			temp/=10;
			System.out.println(lastDigit+" "+cube+" "+armstrong);
		}
		if(n==armstrong) {
			System.out.println("entered number is armstrong.");
		}else {
			System.out.println("entered number is not armstrong.");
		}
	}

}
