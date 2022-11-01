package com.sgtesting.arraytwodimensional;

public class ProgramToReadFirstRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{12,23,34},{45,56,78},{11,22,33}};
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<3;j++)
			{

				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
