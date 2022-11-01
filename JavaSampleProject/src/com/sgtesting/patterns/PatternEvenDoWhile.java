package com.sgtesting.patterns;

public class PatternEvenDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			int j=2;
			do
			{
				System.out.print(j+" ");
				j=j+2;

			}while(j<=i*2);
			System.out.println();
			i++;

		}while(i<=5);
	}

}
