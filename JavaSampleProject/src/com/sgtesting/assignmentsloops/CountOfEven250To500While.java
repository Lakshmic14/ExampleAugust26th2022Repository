package com.sgtesting.assignmentsloops;

public class CountOfEven250To500While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int count=0;
           int i=250;
           while(i<=500)
           {
        	   if(i%2==0)
        	   {
        		   count++;
        	   }
        	   i++;
           }
        System.out.println(count);   
	}

}
