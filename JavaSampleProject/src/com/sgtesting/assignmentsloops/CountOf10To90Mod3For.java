package com.sgtesting.assignmentsloops;

public class CountOf10To90Mod3For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=10;i<=90;i++)
		{
			if(((i%3)==0)||((i%6)==0)||((i%9)==0))
			{
				count++;
			}

		}
		System.out.println(count);
	}

}
