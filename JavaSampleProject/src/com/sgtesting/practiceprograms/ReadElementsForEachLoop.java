package com.sgtesting.practiceprograms;

public class ReadElementsForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int b[]:a)
		{
			for(int c:b)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
