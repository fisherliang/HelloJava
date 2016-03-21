package greetings;

import printing.ColorCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", ColorCartridge.red);
		
		switch(printer.getCartridge())
		{
		case blue:
			System.out.println("Blue");
			break;
		case red:
			System.out.println("Red");
			break;
		case green:
			System.out.println("Green");
			break;
		case yellow:
			System.out.println("Yellow");
			break;
		
		}
		
	}
		
}
