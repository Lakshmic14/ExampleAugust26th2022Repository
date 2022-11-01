package com.sgtesting.patterns;

public class PatternEvenFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i*2;j+=2)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
