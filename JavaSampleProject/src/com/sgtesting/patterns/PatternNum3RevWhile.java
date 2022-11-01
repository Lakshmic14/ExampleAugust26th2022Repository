package com.sgtesting.patterns;

public class PatternNum3RevWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5)
		{
			int j=5;
			while(j>=i)
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i++;
		}
	}

}
