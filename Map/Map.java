package Map;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		var mp = new HashMap<Integer, Integer>();

		for (int i = 1; i <= n; ++i)
			mp.put(i, 100 * i);

		for (Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println(mp);

	}
}
