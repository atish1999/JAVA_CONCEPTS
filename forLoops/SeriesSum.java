package forLoops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n =x.nextInt();
		float sum =0;
//		for (float i =0; i<=n; i++) {
//			sum += 1/i;
//			System.out.println(sum);
//		}
	    for (float i=1; i<=n; i++) {
	    	if(i%2==0) {
	    		sum -=1/i;
	    	}else {
	    		sum +=1/i;
	    	}
	        System.out.println(sum);
	    }
	}

}
