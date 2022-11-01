package com.sgtesting.practice;

class Demo1
{
	Demo1(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	Demo1(int x,int y)
	{
		int res=x+y;
		System.out.println(" Addition Result:"+ res);
	}
}
public class PracticeConstructos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=40;
		Demo1 o1=new Demo1(a,b);

		int kk[]= {1,2,3,4};
		Demo1 o2=new Demo1(kk);
	}

}
