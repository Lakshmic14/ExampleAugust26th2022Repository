package com.sgtesting.tests;

public  final class ExecuteAutoItScriptDemo {

	public static void main(String[] args) {
		executeDemo();
	}
private static void executeDemo()
{
	try
	{
		Runtime.getRuntime().exec("D:\\GITRepository\\TestWindow.exe");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
