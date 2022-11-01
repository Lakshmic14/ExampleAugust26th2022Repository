package com.sgtesting.ArrayAssignmentApproach;

public class DivisibleBy2Or6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=30;i<=90;i++)
		{
			if(i%3==0||i%6==0)
			{
				count++;

			}
		}
		System.out.println(count+" : count of numbers");
		int a[]=new int[count];
		int k=0;
		for(int p=30;p<=90;p++)
		{
			if(p%3==0||p%6==0)
			{

				a[k]=p;
				k=k+1;
			}
		}
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
