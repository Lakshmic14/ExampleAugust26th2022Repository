package com.sgtesting.ArrayAssignmentApproach;
//1.we will make sure whether we can display numbers between 100 to 150.
//2.Among 100 to 150 numbers which are divisible by 4.
//3.Find out the size of the array to store  numbers which are divisible by 4 in between 100 to 150.
//4.declare the integer array.
//5.Assign  numbers in to the current array.
//6.Read the elements of the array in reverse order.

public class DivisivleBy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find out Size of array
		int count=0;
		for(int i=100;i<=150;i++)
		{
			if(i%4==0)
			{
				count++;
			}

		}
		System.out.println("count of numbers which are divisible by 4 is : "+count);


		//declare one dimensional array
		int n[]=new int[count];
		//assign  numbers in to an array
		int k=0;
		for(int p=100;p<=150;p++)
		{
			if(p%4==0)
			{
				n[k]=p;
				k=k+1;
			}
		}
		//read elements in reverse order
		for(int j=n.length-1;j>=0;j--)
		{
			System.out.println(n[j]);
		}
	}

}


