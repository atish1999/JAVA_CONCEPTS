package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		Pet p = d;
		p.name="tom";
		d.name="jerry";
		System.out.println(p.name);
		System.out.println(d.name);
	}

}
