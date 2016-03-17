package greetings;

import printing.BWCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		//Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", new ColorCartridge());
		//printer.print(1);
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		printer.print(1);

		
	}
}
