package com.sgtesting.patterns;

public class PatternEvenWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5)
		{
			int j=2;
			while(j<=i*2)
			{
				System.out.print(j+"");
				j=j+2;

			}
			System.out.println();
			i++;

		}
	}

}
