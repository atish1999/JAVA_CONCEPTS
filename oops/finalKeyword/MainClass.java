package oops.finalKeyword;

public class MainClass {
	int rollNo =9;
	public static void main(String[] args) {
//		final int x;
//		
//		x=9;
//		System.out.println(x);
//		Student obj =new Student("atish");
//		System.out.println(obj.name);
		Student obj= new Student();
		Student obj2 =new Student();
		obj2=obj;
		obj.rollNo=9;
//		System.out.println(obj2.rollNo);
		int x=6;
		int y=7;
		x=y;
		y=9;
		System.out.println(x);
		
	}

}
