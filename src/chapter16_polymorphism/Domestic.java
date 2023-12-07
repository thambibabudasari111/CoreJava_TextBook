package chapter16_polymorphism;

public class Domestic extends Commercial {

	// override the calculateBill() method of commercial

	void calculateBill(int units) {
		System.out.println("customer: " + getName());
		System.out.println("bill amount: " + (units * 2.50));
	}

	public static void main(String[] args) {

		// call calculateBill() using commercial object
		Commercial obj1 = new Commercial();

		obj1.setName("Thambi");
		obj1.calculateBill(100);

		// call calculateBill() using the Domestic object
		Domestic obj2 = new Domestic();

		obj2.setName("Babu");
		obj2.calculateBill(100);
	}

}
