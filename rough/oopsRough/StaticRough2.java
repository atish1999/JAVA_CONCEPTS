package rough.oopsRough;

public class StaticRough2 {
	static {
		System.out.println("kaise ho");
	}
	
	
	static int a=fun1();
	
	static {
		System.out.println("hi");
	}
	static int b =fun();
	static int fun1() {
		System.out.println("wow");
		return 10;
	}
	

	public static void main(String[] gs) {
		System.out.println(a+" "+ b);
		System.out.println("you are welcome");
		
		
	}
	static int fun() {
		System.out.println("hello");
		return 20;
	}

}
