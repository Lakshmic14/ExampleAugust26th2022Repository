package com.sgtesting.arrayassignment;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]=new double[4];

		a[0] = 100;
		a[1] = 300;
		a[2] = 400;
		a[3] = 500;

		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element at Index : "+ i + " " + a[i]);
		}
	}
}
