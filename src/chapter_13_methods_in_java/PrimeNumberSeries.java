package chapter_13_methods_in_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberSeries {

	
	//to test and return true if num is prime
	static boolean prime(long num)
	{
		//initially isPrime is true, it becomes false if num is not prime
		boolean isPrime = false;
		
		//from 2 to num-1, if any number divides num, it's not prime
		for(int i=2;i<=num-1;i++)
		
			if(num%i==0) 
				isPrime = false;
			return isPrime;
		
	}
	
	//accept how many primes required into max
	//c is counter for no.of primes generated
	
	static void generate(long max)
	{
		long c=1, num=2;
		while(c<=max)
		{
			if(prime(num)) //call prime() method directly
			{
				System.out.println(num);
				++c;
			}
			++num;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		//accept the number of primes are needed
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("how many primes? ");
		int max = Integer.parseInt(br.readLine());
		
		//generate max no.of primes
		PrimeNumberSeries.generate(max);
	}

}
