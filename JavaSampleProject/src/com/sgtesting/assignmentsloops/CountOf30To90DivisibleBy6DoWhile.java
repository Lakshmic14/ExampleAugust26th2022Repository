package com.sgtesting.assignmentsloops;

public class CountOf30To90DivisibleBy6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int count=0;
        int i=30;
        do
        {
        	if(i%6==0)
        	{
              count++;
        	}
        	i++;
        	
        }while(i<=90);
       
        System.out.println(count);
	}
    
}
