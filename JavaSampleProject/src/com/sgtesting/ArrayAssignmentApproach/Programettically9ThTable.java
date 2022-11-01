package com.sgtesting.ArrayAssignmentApproach;
//1.we will make sure whether we can display multiples of 9 table.
//2.in that we make sure display the res.
//3.Find out the size of the array to store result of the  9 table.
//4.declare the integer array.
//5.assign the result value in to the current array.
//6.read the elements in the array.
public class Programettically9ThTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int n=9;
		for(int i=1;i<=10;i++)
		{
			count++;
		}
		System.out.println(count+" : elements of count");
		//declare single dimensional array
		int a[]=new int[10];
		//Assign result to an array
		int k=0;
		
		for(int p=1;p<=10;p++)
		{
			a[k]=p;
			k=k+1;
		}
		//read elements in reverse order
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]*n);
		}
	}

}




