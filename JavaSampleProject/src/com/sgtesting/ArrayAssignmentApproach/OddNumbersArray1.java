package com.sgtesting.ArrayAssignmentApproach;
//1.we will make sure whether we can display numbers between 71 to 41.
//2.Among 71 to 41 numbers try to odd numbers.
//3.Find out the size of the array to store odd numbers between 71 to 41.
//4.declare the integer array.
//5.Assign odd numbers in to the current array.
//6.Read the elements of the array in reverse order.

public class OddNumbersArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find out Size of array
		int count=0;
		for(int i=71;i>=41;i--)
		{
			if(i%2==1)
			{
				count++;
			}

		}
		System.out.println("count of odd numbers is : "+count);


		//declare one dimensional array
		int odd[]=new int[count];
		//assign odd numbers in to an array
		int k=0;
		for(int p=71;p>=41;p--)
		{
			if(p%2==1)
			{
				odd[k]=p;
				k=k+1;
			}
		}
		//read elements in reverse order
		for(int j=odd.length-1;j>=0;j--)
		{
			System.out.println(odd[j]);
		}
	}

}
