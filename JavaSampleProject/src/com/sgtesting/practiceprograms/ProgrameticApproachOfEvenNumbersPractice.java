package com.sgtesting.practiceprograms;

public class ProgrameticApproachOfEvenNumbersPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find out size of an array
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("# of elements"+count);
		//Declare single dimensional array
		int even[]=new int[count];
		//assign even numbers into an array
		int k=0;
		for(int p=20;p<=40;p++)
		{
			if(p%2==0)
			{
				even[k]=p;
				k=k+1;
			}
		}
		//read elements in reverse order
		for(int j=even.length-1;j>=0;j--)
		{
			System.out.println(even[j]);

		}
	}

}
