package hackerrank;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[ ] =new int[4];
		int n =a.length;
		System.out.println(" enter the elements");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int result = SimpleArraySum(a);
		System.out.println(result);
		

	}
	static int SimpleArraySum(int ar[]) {
		int sum =0;
		for(int e: ar) {
			sum+=e;
		}
		return sum;
	}

}
