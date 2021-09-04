package methods;

public class PassByValue {

	public static void main(String[] args) {
//		int a = 25;
//		fun(a);
//		System.out.println(a);
//		int c= 34;
//		int d= 43;
//		Dog c = new Dog();
//		Dog d = new Dog();
//		c.legs=4;
//		d.legs=3;
//		swap(c,d);
//		System.out.println(c.legs +" "+d.legs);
//		System.out.println(c+" "+d);
//		swap(c,d);
//		c=c-2;
//		System.out.println(c+" "+d);
		Dog c =new Dog();
		Dog d =new Dog();
		c.legs=4;
		d.legs=3;
		change(c);
		System.out.println(c.legs+" "+d.legs);
		System.out.println(swap(c,d));
		c.max(c);
	
		
//		System.out.println(a.legs);
//		System.out.println(a.eyes);
	}
//	static void fun(int b) {
//		b =10;
//		System.out.println(b);
//		
//	}
static String swap(Dog a, Dog b) {
		a.legs=8;
		b.legs=9;
		int temp =a.legs;
		a.legs=b.legs;
		b.legs=temp;
		return(a.legs+ " "+b.legs);
	}
static void change(Dog dog) {
	dog.legs =5;
	dog.eyes =6;
}
	
//	static void swap(int a, int b) {
//		int temp = a;
//		a=b;
//		b =temp;
//		System.out.println(a+" "+ b);
//		
//	}
}
class Dog {
	int eyes;
	int legs;
	public void max(Dog g) {
		System.out.println("bhao");
	}
	

}

