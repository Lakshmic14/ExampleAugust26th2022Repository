package com.sgtesting.patterns;

public class PatternDowhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			int j=1;
			do
			{

				System.out.print("#"+" ");
				j++;
			}while(j<=5);
			System.out.println();
			i++;

		}while(i<=3);
	}

}
