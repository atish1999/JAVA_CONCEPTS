package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {23, 67,8,45,29,34};
		int n= a.length;
		for(int i=0; i<n-1;i++) {
			boolean sorted =true;
			for(int j=0; j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted =false;
				}
			}
			if(sorted) break;
		}
//		for (int i=0,j=a.length-1; i<j; i++,j--) {
//			int temp =a[i];
//			a[i]=a[j];
//			a[j]=temp;
//		}
		for(int e: a) {
			System.out.print(e+" ");
		}
	}
}
