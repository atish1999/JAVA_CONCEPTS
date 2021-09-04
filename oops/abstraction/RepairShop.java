package oops.abstraction;

public class RepairShop {
	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	
	public static void main(String[] gs) {
		
		Audi audi = new Audi();
//		WagonR wagonR = new WagonR();
//	    repairCar(audi);repairCar(wagonR);
		Car a = audi;
		
	}
	
}
 