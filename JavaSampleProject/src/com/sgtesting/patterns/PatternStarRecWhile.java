package com.sgtesting.patterns;

public class PatternStarRecWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)
		{
			int j=1;
			while(j<=4)
			{
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
