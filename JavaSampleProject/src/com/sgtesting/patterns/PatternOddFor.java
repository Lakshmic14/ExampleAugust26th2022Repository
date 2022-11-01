package com.sgtesting.patterns;

public class PatternOddFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<=5;i++)
		{

			for(int k=1;k<=i;k++)
			{
				
				System.out.print(n+" ");
				n=n+2;
			}
			System.out.println();
		}
		
	}
}


