package com.sgtesting.arraytwodimensional;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]= {{"hello"},{"welcome"},{"to java programing"}};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");

			}
			System.out.println();
		}

	}

}
