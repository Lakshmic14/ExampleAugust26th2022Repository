package com.sgtesting.patterns;

public class PatternOddDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(n+" ");
				n=n+2;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
