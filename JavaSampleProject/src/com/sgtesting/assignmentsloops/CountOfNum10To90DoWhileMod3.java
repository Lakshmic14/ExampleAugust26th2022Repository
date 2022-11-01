package com.sgtesting.assignmentsloops;

public class CountOfNum10To90DoWhileMod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int count=0;
		do
		{
			if(((i%3)==0)||((i%6)==0)||((i%9)==0))
			{
		         count++;
			}
			i++;
		}while(i<=90);
		
		System.out.println(count);
	}

}
