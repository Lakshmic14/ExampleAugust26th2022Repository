package com.sgtesting.assignmentsloops;

public class CountOf30T090DivisibleBy6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        int i=30;
        while(i<=90)
        {
        	if(i%6==0)
        	{
        		count++;
        	}
        	i++;
        }
        System.out.println(count);
	}

}
