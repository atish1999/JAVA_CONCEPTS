package oops;
import java.util.Scanner;
class Vehicles{
	int wheels;
	String color;
	Vehicles(){
		
	}
	Vehicles(int wheels){
		this.wheels =wheels;
	}
	Vehicles(int wheels, String color){
		this.wheels =wheels;
		this.color =color;
	}
	
}

public class MyConstructor {	
	
	MyConstructor(){
		System.out.println("object has been created");
		
	}

	public static void main(String[] args) {
//		MyConstructor obj = new MyConstructor();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Vehicles car = new Vehicles();
		Vehicles scooty =new Vehicles(n, "yellow");
//		System.out.println("the scooty has "+scooty.wheels +
		
//		 " wheels and it's color is "+scooty.color);
		System.out.println(car.wheels+ " wheels "+ car.color+ " color");
		
		

	}

}
