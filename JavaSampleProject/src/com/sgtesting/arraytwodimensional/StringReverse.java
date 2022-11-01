package com.sgtesting.arraytwodimensional;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]= {{"hello"},{"welcome"},{"eclipse"}};
		for(int i=s.length-1;i>=0;i--)
		{
			for(int j=s[i].length-1;j>=0;j--)
			{
				System.out.print(s[i][j]+" ");

			}
			System.out.println();
		}
	}

}
