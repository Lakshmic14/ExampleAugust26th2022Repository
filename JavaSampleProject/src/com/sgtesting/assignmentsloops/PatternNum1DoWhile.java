package com.sgtesting.assignmentsloops;

public class PatternNum1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.println(j+"");
				j++;

			}while(j<=i);

			i++;
		}while(i<=5);

		System.out.println();
	}

}
