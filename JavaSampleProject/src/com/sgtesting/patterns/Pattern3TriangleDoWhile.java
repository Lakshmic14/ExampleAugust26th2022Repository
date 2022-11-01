package com.sgtesting.patterns;

public class Pattern3TriangleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(" 3 ");
				j++;
			}while(j<=i);

			System.out.println();
			i++;

		}while(i<=5);
	}

}
