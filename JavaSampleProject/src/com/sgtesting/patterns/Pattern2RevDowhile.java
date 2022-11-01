package com.sgtesting.patterns;

public class Pattern2RevDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		do
		{
			int j=1;
			do
			{
				System.out.print(" 5 ");
				j++;

			}while(j<=i);

			System.out.println();
			i--;
		}while(i>=1);
	}

}
