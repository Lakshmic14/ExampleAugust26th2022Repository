package com.sgtesting.assignmentsloops;

public class CountOfEven250To500DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int count=0;
       int i=250;
       do
       {
    	   if(i%2==0)
    	   {
    		   count++;
           }
    	   i++;
       }while(i<=500);
       
       System.out.println(count);
       
      
	}

}
