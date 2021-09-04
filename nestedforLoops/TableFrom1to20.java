package nestedforLoops;

public class TableFrom1to20 {

	public static void main(String[] gs) {
		for(int j=1; j<=60; j++) {
			int table=j;
			for(int i=1; i<=20; i++) {
                int result= table*i;
				System.out.print(result+" ");
			}
		    System.out.println();
		}
		

	}

}
