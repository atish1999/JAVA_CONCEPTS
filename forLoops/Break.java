package forLoops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
//		for(int i=1; i<=100; i++) {
//			if(i==35) { 
//				System.out.println(i);
//				break;
//			}
//			
//		}
				Scanner sc =new Scanner(System.in);
				System.out.println("enter a positive number.");
				int n = sc.nextInt();
				for(;;) {
					System.out.println(n);
					if(n<0) 
						break;
		}
		
	
	}

}
