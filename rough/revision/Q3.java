package rough.revision;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int sum =0;
		for(int e: a) {
			sum+=e;
		}
		System.out.println(sum);
	}

}
