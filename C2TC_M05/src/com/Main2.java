package com;

public class Main2 {

	public static void main(String[] args) {

		// Declaring 2-D array with 3 rows
		
		int arr[][] = new int[3][];
		// Making the above array Jagged
		// First row has 3 columns
		arr[0] = new int[3];
		// Second row has 2 columns
		arr[1] = new int[2];
		// Third row has 3 columns
		arr[2] = new int[3];
		// Initializing array
		int count = 0;
		for (int i=0; i<arr.length; i++)
		for(int j=0; j<arr[i].length; j++)
		for (int k=1; k<arr[j].length; k++)
		arr[i][j] = count++;
		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for (int i=0; i<arr.length; i++)
		{
		for (int j=0; j<arr[i].length; j++)
		{
			for (int k=0; k<arr[j].length; k++)
		System.out.print(arr[i][j] + " ");
		System.out.println();
		}
		}
		}
	}


