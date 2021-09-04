package rough.oopsRough;

public class StaicRough4 {
	static int x =4;
	static {
		
	}
	static class M1 {
		


		static void m() {
	         x=6;
	         int z =9;
			System.out.println(x+""+z);;
		}
	}
	class M2 {
		void n() {
			x=9;
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		StaicRough4 y= new StaicRough4();
//		M1 objM1 = new StaicRough4.M1();
		StaicRough4.M2 objM2 = y.new M2();
//		objM1.m();
//		objM2.n();
		M1.m();
	}	
		
}

	
