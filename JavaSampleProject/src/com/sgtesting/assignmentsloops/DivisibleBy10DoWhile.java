package com.sgtesting.assignmentsloops;

public class DivisibleBy10DoWhile {

	public static void main(String[] args) {
		int i=100;
		do
		{
			if(i%10==1)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=150);

	}

}
