package com.sgtesting.patterns;

public class PatternNum3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			int j=5;
			do
			{
				System.out.print(j+" ");
				j--;
				
			}while(j>=1);

			System.out.println();
			i++;

		}while(i<=5);

	}

}
