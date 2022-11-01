package com.sgtesting.assignmentsloops;

public class CountFreom170To70DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=170;
		int count=0;
		do
		{
			if(i%5==0)
			{
				count++;
			}
			i--;

		}while(i>=70);

		System.out.println(count);
	}

}
