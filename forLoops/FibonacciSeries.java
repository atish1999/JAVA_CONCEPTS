package forLoops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= 0;
		int b=1;
		if(n>=2) {
			System.out.print(a+" ");
			System.out.print(b+" ");
		}else {
			System.out.print(0);
		}
		for(int i=0; i<n-2; i++) {
			int c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
