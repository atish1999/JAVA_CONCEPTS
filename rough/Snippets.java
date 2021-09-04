package rough;

public class Snippets {

	public static void main(String[] args) {
//		int a=2,b=2;
//		int c=a|--b;
//		int d=a--&--b;
//		System.out.println(a+" "+b+" "+c+" "+d+" ");
//		int a=2;
//		int b=3;
//		int c=2|3;
//		System.out.println(c);
		int a =36;
		int b=78;
		System.out.println(swap(a,b));
		System.out.println(a+ " "+b);

	}
	static String swap(int a, int b) {
		int temp =a;
		a=b;
		b=temp;
		return (a+" "+b);
	}

}
