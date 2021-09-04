package rough;

public class Rough6 {

	public static void main(String[] args) {
		String a ="listen";
		String b ="silent";
		boolean isAnagram =true;
		int [] al,bl;
		al=new int [256];
		bl =new int [256];
		for(int i =0; i<a.length() ;i++) {
			int index =(int)(a.charAt(i));
			al[index]++;
		}
		for(int i =0; i<b.length() ;i++) {
			int index =(int)(b.charAt(i));
			bl[index]++;
		}
		for(int i=0; i<256; i++) {
			if (al[i]!=bl[i]) {
				isAnagram =false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Strings are anagram of each other.");
		}else {
			System.out.println("Strings are not anagram of each other.");
		}
		

	}

}
