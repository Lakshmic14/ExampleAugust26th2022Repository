package com.sgtesting.practice;

class Addition
{
	Addition(int a[][], int b[][])
	{
		
			
		if(a.length==b.length && a[0].length==b[0].length)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+b[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}

	}
}
public class AdditionOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{11,22,33},{44,55,66},{77,88,99}};
		Addition o1=new Addition(a,b);
		
	}
}
