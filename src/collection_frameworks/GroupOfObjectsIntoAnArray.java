package collection_frameworks;

public class GroupOfObjectsIntoAnArray {

	// instance vars
	int id;
	String name;

	// to store data
	GroupOfObjectsIntoAnArray(int i, String n) {

		id = i;
		name = n;
	}

	// method to display data
	void displayData() {
		System.out.println(id + "\t" + name);
	}

}
