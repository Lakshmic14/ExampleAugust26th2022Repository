package com.sgtesting.patterns;

public class PatternNum2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int k=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(k+" ");
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
