package com.sgtesting.arraytwodimensional;

public class CharReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
	}

}
