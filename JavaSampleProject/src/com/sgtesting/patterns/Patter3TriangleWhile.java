package com.sgtesting.patterns;

public class Patter3TriangleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(" 3 ");
				j++;
			}
			System.out.println();
			i++;
		}
			
		}
		
}
