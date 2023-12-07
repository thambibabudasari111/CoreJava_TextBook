package chapter16_polymorphism;

public class Commercial {

	// take customer name
	private String name;

	// method to set user name
	void setName(String name) {
		this.name = name;
	}

	// method to retrieve name
	String getName() {
		return name;
	}

	// calculate electricity bill for commercial
	void calculateBill(int units) {
		System.out.println("customer: " + getName());
		System.out.println("bill amount: " + (units * 5.0));
	}

}
