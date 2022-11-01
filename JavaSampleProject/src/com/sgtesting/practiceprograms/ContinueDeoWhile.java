package com.sgtesting.practiceprograms;

public class ContinueDeoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i<=30)
		{
			i++;
			if(i%2==0)
			{
				continue;

			}

			System.out.println(i);


		}
	}

}
