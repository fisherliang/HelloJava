package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "My Printer", new BWCartridge());
		
		try{
			printer.print(-1);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}
		

	}

}
