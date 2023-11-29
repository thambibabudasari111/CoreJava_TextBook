package chapter_13_methods_in_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassingArraysToMethods {

	/*
	 * Write a program to add two matrices and display sum matrix. Passing arrays to methods and returning them
	 */
	
	//take 2D array for matrix and row, cols
	int arr[][];
	int r,c;
	
	//initialize r,c and allot memory for array
	PassingArraysToMethods(int r, int c)
	{
		this.r=r;
		this.c=c;
		arr = new int[r][c];
	}
	
	//accept 2D array from keyboard and return it
	int[][] getMatrix() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer is useful to accept each row as a single string and then
		//divide it into tokens. Each token represents an array element.
		StringTokenizer st;
		
		for(int i=0; i<r; i++)
		{
			String s = br.readLine();
			st = new StringTokenizer(s," ");
			for(int j=0; j<c; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
			
		}
		return arr;
	}
	
	//accept two 2D arrays and find sum matrix and return it
	int[][] findSum(int a[][],int b[][])
	{
		int temp[][] = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				temp[i][j] = a[i][j]+b[i][j];
		return temp;
						
	}
	
	//display the resultant 2D array as a matrix.
	void displayMatrix(int res[][])
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {

		//create 2 objects to matrix class, since each object contains an array
		PassingArraysToMethods obj1 = new PassingArraysToMethods(3,3); //3x3 matrix
		PassingArraysToMethods obj2 = new PassingArraysToMethods(3,3); //3x3 matrix
		
		//take 3 reference for 2D arrays.
		int x[][], y[][],z[][];
		
		System.out.println("\nEnter elements for first matrix: ");
		x = obj1.getMatrix();
		System.out.println("\nEnter elements from second matrix: ");
		y = obj2.getMatrix();
		
		//add the matrices and return sum matrix into z
		z = obj1.findSum(x, y);
		System.out.println("\nThe sum matrix is: ");
		obj2.displayMatrix(z);
		
		
	}

}
