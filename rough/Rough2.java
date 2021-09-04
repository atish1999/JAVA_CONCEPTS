package rough;

import java.util.Scanner;

public class Rough2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt(),sum=0,lastDigit;
////		for(int i=1; i<=4; i++) {
////			lastDigit=n%10;
////			sum+=lastDigit;
////			n/=10;
////			System.out.println(lastDigit+" "+sum+" "+n);
////		}
//		for(int i=n; i!=0; i/=10) {
//			lastDigit=i%10;
//			sum+=lastDigit;
//			
//		}
//		System.out.println(sum);
//		int x=6;
//		for(x=1; x<=4;x++) {
//			System.out.println(x);
//			
//		}
//		System.out.println(x);
//		int y;
//		for(y=1; y<=4;y++) {
//			System.out.println(x);
			
//		}
//		System.out.println(y);
		int[] a=new int[5];
		int i=0;
//		for(int e=0;e<5;e++) {
//			a[e]=sc.nextInt();
//		}
		for(int element: a) {
			element =sc.nextInt();
			a[i]=element;
		}
//		for(int i=0;i<2; i++) {
//			a[i]=sc.nextInt();
//		}
		System.out.println("array will be");
		for( i=0;i<5; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		}

}
