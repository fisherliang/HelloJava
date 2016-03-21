package greetings;

import printing.ColorCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", ColorCartridge.blue);
		
		printer.loadPaper(5);
		printer.print(3);
		printer.outPutPage(2);
		
	}
		
}
