package collection_frameworks;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {

		// create a HashSet to store strings
		HashSet<String> hs = new HashSet<>();

		// store some string elements
		hs.add("America");
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		hs.add("America");

		// view the HashSet
		System.out.println("Hash Set = " + hs);

		// add an Iterator to hs
		Iterator it = hs.iterator();

		// display element by element using iterator
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}

}
