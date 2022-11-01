package com.sgtesting.arraytwodimensional;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}

	}

}
