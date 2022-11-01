package com.sgtesting.ArrayAssignmentApproach;
//1.we will make sure whether we can display numbers between 1 to 10
//2.Among 1 to 10 numbers try to square the numbers.
//3.Find out the size of the array to store square numbers between 1 to 10.
//4.declare the integer array.
//5.Assign square numbers in to the current array.
//6.Read the elements of the array in reverse order.
public class SquareOf1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing the square of the numbers
		int count=0;
		for(int i=1;i<=10;i++)
		{
			
			count++;
		}
		System.out.println(count+" : elements of count");
		//declare the array
		int arr[]=new int[count];
		//assign the values the array
		int k=0;
		for(int p=1;p<=10;p++)
		{
			arr[k]=p;
			k=k+1;

		}
		//read the array in the reverse order
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(j*j);
		}
	}

}
