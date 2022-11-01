package com.sgtesting.practice;

class Demo2
{
	Demo2(int arr[])
	{
		
		for(int i=0;i<=arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(" num is even");
			}
			else
			{
				System.out.println("nu is odd");
			}
		}
	}
}
public class Logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,11,12,13,14,15,16};		
Demo2 o1=new Demo2(arr);
	}

}
