package rough.oopsRough;

public class StaticRough3 {
	static int a=10;
	int b=20;
	static void m1() {
		
		a=30;
		m2();
		
	}
	static void m2() {
		
	}
	void m3() {
		this.a =9;
		this.b =6;
	}
	StaticRough3(){
		this.b=34;
		this.a=35;
		System.out.println(a+ " " +b+" hello kaisan ba");
		
	}
	
	public static void main(String[] args) {
//		m1();
		StaticRough3 y =new StaticRough3();
		System.out.println(a);
	}

}
//	class A {
//		int b;//instance variables
//		A(){
//			this.b=20;
//		}
//	}
