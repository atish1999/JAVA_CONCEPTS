package oops.singletons;

public class MainClass {

	public static void main(String[] args) {
		 AppConfig obj1 =AppConfig.getInstance();
		 AppConfig obj2 =AppConfig.getInstance();
		 System.out.println(obj1==obj2);
	}

}
