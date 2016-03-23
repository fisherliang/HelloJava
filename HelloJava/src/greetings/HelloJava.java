package greetings;


import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import printing.ContinuousPrinter;


public class HelloJava {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ContinuousPrinter cp = new ContinuousPrinter();
		
//		Thread thread = new Thread(cp);
//		thread.start();
		
		//ExecutorService executor = Executors.newFixedThreadPool(10);
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		
		executor.shutdown();
		
		
		for(int i=0;i<100;i++)
			System.out.println("Main Thread : " + i);
	}
		
}
