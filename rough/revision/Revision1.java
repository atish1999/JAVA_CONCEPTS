package rough.revision;

import java.util.Scanner;
public class Revision1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime =true;
		if(n>=2) {
			for(int i =2; i*i<=n; i++) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
		}else  {
			isPrime =false;
			
		}
		if(isPrime) {
			System.out.println("entered number is prime");
	    }else {
	    	System.out.println("entered number is not prime.");
	    }
	}

}
