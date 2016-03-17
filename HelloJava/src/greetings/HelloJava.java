package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true, "My Printer 2", new ColorCartridge());

		printOne(printer);

	}
	
	public static void printOne(Printer<? extends ICartridge> printer)
	{
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}
}
