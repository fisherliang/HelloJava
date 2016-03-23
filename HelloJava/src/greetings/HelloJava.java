package greetings;


import java.lang.reflect.InvocationTargetException;

import printing.ContinuousPrinter;


public class HelloJava {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ContinuousPrinter cp = new ContinuousPrinter();
		
		Thread thread = new Thread(cp);
		thread.start();
		
		for(int i=0;i<100;i++)
			System.out.println("Main Thread : " + i);
	}
		
}
