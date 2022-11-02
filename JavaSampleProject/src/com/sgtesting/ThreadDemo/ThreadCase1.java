package com.sgtesting.ThreadDemo;

class MyThread implements Runnable
{
	public void run() {
		displayEvenNumber();		
	}

	private void displayEvenNumber() {
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even number:"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public class ThreadCase1 {

	public static void main(String[] args) {
		MyThread job =new MyThread();
		Thread t1=new Thread(job);
		t1.start();
	}

}
