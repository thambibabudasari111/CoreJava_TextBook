package chapter_11_oops_concepts;

public class Abstraction {
	
	/*
	 *A bank clerk should see the customer details like account number, name, and balance amount in the account.
	 *He should not entitled to see the sensitive data like the staff salaries, profits, or loss of the bank, interest amount paid by bank
	 *and loans amount to be recovered.
	 *
	 * diplay_to_clerk() method is able to access and display only the accno, name, and balance. It can't access profit and loan of the customer.
	 */

	private int accno;
	private String name;
	private float balance;
	private float profit;
	private float loan;
	
	
	
	Abstraction()
	{
		accno = 753998438;
		name = "thambibabu";
		balance = 5579.89f;
		profit = 253839.7438f;
		loan = 3434324.34345f;
	}
	
	public void displauy_to_clerk()
	{
		System.out.println("Acc no = "+accno);
		System.out.println("Name = "+name);
		System.out.println("Balance = "+balance);
	}
	
	
	public static void main(String[] args) {

		Abstraction ab = new Abstraction();
		ab.displauy_to_clerk();
		
		
	}

}
