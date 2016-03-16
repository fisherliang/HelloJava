package greetings;

import printing.Machine;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Machine machine = new Printer(true, "My Printer");
		//Machine machine = new Machine(false);
		machine.turnOn();

		
	}
}
