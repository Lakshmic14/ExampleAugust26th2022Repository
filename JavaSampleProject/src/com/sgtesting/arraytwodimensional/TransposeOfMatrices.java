package com.sgtesting.arraytwodimensional;

public class TransposeOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int transpose[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				transpose[i][j]=arr[j][i];
				System.out.print(transpose[i][j]+"  ");
			}

			System.out.println();
		}

	}

}
