package oops;

import oops.A.C;

public class StaticKeyword {
     static class Student{
		int age;
		String name;
		static int color= 4;
		static int max(int a, int b) {
			return a>=b ?a: b;
		}
	}
	  static class Teacher{
		 int age;
		 int c= Student.max(1, 2);
		 static void wow() {
				System.out.println(Person.breed);
				
			}
	 }

	public static  void main(String[] args) {
//		Student obj = new Student();
//		System.out.println(Student.breed);
//		new Student();
//	
//		System.out.println(Student.color);
//		System.out.println(Math.PI);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Teacher.wow());
//		Teacher.wow();
//		A objA =new A();
//		A.B objB = objA.new B();
		C objC = new A.C();
		
		
	}
	static void main() {
		System.out.println("hi");
	}
	

}
