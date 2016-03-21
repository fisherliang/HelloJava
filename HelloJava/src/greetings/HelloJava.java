package greetings;

import java.io.File;
import java.io.IOException;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		
		printer.loadPaper(10);
		printer.print(5);
		
		printer.outPutPages();
	}

}
