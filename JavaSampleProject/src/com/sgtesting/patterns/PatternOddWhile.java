package com.sgtesting.patterns;

public class PatternOddWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(n+" ");
				n=n+2;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
