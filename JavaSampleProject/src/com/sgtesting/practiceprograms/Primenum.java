package com.sgtesting.practiceprograms;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23;
		int cc=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				cc++;
				break;
			}
		}
		if(cc==0)
		{
			System.out.println("is a prime num");
		}
		else
		{
			System.out.println(" is not a prime num");
		}
	}

}
