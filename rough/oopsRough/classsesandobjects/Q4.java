package rough.oopsRough.classsesandobjects;


class DemoClass{
	int a=1;
	void fun() {
		Demo obj =new Demo();
		obj.display();
		
	}
	 class Demo {
		 int b =2;
		void display() {
			System.out.println("na "+ a);
		}
	}
	 void get() {
		
		System.out.println();
	}
}

public class Q4 {

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		

	}

}
