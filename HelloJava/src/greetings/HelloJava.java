package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		//Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", new ColorCartridge());
		//printer.print(1);
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		printer.printUsingCartridge(new ColorCartridge(), "Hi");

		
	}
}
