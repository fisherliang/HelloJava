package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		//printer.printUsingCartridge(new BWCartridge(), "Hi");
		printer.print(1);

		
	}
}
