package rough.oopsRough;
class A{
	static {
		System.out.println(" hello ");
		
	}
	
	void main() {
		
	}
}
public class StaticRough5 {
	static int a;int c;
	static class B{
		static int b;
		static {
			 System.out.println("hi");
			 
		}
		
		
	}
	int b;
	static {
		System.out.println("inside block 1");
		a=10;
		
	}
	static {
		System.out.println("inside block 2");
	}
	public static void main(String[] gs) {
		StaticRough5 y =new StaticRough5();
		A o =new A();
		A x = o;
//		System.out.println();
//		System.out.println(B.b);
//		System.out.println("inside main");
		System.out.println(y.b);
	}
}
