package chapter14_relationship_between_objects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankAcct_InnerClass {

	//balance amount is the variable
	private double balance;
	
	//initialize the balance
	BankAcct_InnerClass(double bal)
	{
		this.balance=bal;
	}
	
	//in this method, inner class object is created after verifying the authentication of user. 
	//r is rate of interest, this method accepts the rate of interest r
	void contact(double r) throws Exception
	{
		//accept the password from keyboard and verify
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter password: ");
		String password = br.readLine();
		
		if(password.equals("xyz123"))
		{
			//if password is correct then calculate interest
			Interest in = new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.println("sorry, you are not authorized person");
			return;
		}
	}
	
	//inner class
	private class Interest
	{
		//rate of interest
		private double rate;
		
		//initialize rate 
		Interest(double r)
		{
			this.rate=r;
		}
		
		//calculate interest amount and update balance
		void calculateInterest()
		{
			double interest = balance*rate/100;
			balance += interest;
			System.out.println("updated balance = "+balance);
		}
	}
	
	public static void main(String[] args) throws Exception {

		//bank account is holding a balance of 10000
		BankAcct_InnerClass  account = new BankAcct_InnerClass(10000);
		
		//update balance amount by adding interest at 9.5
		account.contact(9.5);
		
		
	}

}
