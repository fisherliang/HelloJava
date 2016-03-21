package greetings;

import java.util.LinkedList;
import java.util.Queue;

import printing.BWCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		
		Queue<String> myQueue = new LinkedList<String>();
		
		myQueue.offer("a");
		myQueue.offer("b");
		myQueue.offer("c");
		
		while(myQueue.peek() != null)
		{
			System.out.println(myQueue.poll());
		}
	}

}
