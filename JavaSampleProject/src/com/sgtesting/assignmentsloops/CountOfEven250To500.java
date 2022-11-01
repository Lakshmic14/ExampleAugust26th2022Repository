package com.sgtesting.assignmentsloops;

public class CountOfEven250To500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        for(int i=250;i<=500;i++)
        {
        	if(i%2==0)
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
