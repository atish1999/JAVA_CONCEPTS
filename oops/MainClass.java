package oops;
class Cat{
	boolean hasFur;
	String color,breed;
	char legs,eyes;
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("my cat has "+ legs +" legs and "+ eyes +" eyes");
	}
}
class Dog{
	String breed,name;
	public void jump() {
		System.out.println("my dog "+name+" jumped");
	}public void description(){
		System.out.println("my dog's name is "+name+" and it's breed is "+breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
//		Cat cat1 =new Cat();
//		Cat cat2 = new Cat();
//		cat1.walk();
//		cat2.eat();
//		
//		cat1.eyes ='b';
//		cat2.legs='c';
//		cat2.eyes ='d';
//		cat1.description();
//		cat2.description();
		Dog husky = new Dog();
		Dog poodle =new Dog();
		husky.breed ="husky";
		poodle.breed ="poodle";
		husky.name="browny";
		poodle.name ="tommy";
		husky.jump();
		husky.description();
		poodle.jump();
		poodle.description();
		
		
	}

}
