package com.sgtesting.arraytwodimensional;

public class ReadFirstColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{12,23,34},{45,56,78},{11,22,33}};

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<1;j++)
			{

				System.out.print(a[i][0]+"   ");
			}
			System.out.println();
		}
	}

}
