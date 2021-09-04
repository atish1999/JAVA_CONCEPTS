package questions;
import java.util.*;
public class TwoPointerAlgorithm {
	public static boolean twoSum(int a[], int x,int i) {
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]< x) {
				i++;
			}else if(a[i]+a[j]>x) {
				j--;
			}else {
				return true;
			}
		}
		return false;
	}
	public static  boolean triplets(int b[]) {
		
		Arrays.sort(b);
		for(int i=0; i<b.length-2; i++) {
			if(twoSum(b, -b[i], i+1)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int a[]= {-4,-6,8};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			if(triplets(a)) {
				System.out.println(1);
				break;
			}else  {
				System.out.println(0);
			}

			
		}
		
	}

}
