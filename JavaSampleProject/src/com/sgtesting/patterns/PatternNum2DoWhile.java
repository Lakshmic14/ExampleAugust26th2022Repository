package com.sgtesting.patterns;

public class PatternNum2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(k+" ");
				k++;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}

}
