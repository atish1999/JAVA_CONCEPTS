package oops.inheritance;

public class Singer extends Person {
	String name;
	public Singer(String name) {
		super(name);
		
		
	}
	public void sing( ) {
		System.out.println(" is singing");
	}
	public void walk() {
		System.out.println("Singer "+super.name+" is walking");
	}

}
