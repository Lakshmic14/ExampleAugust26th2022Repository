package com.sgtesting.assignmentsloops;

public class CountFrom170To70While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=170;
        int count=0;
        while(i>=70)
        {
        	if(i%5==0)
        	{
        		count++;
        		
        	}
        	i--;
        }
        System.out.println(count);
        
	}

}
