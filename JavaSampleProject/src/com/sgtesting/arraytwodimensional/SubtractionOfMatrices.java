package com.sgtesting.arraytwodimensional;

public class SubtractionOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{11,22,33},{44,55,66}};
		int b[][]= {{12,13,14},{15,18,20}};
		int c[][]= new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
