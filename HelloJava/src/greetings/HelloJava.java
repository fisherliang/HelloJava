package greetings;

import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer myPrinter = new Printer(true, "My Printer");
		
		//test for private variable
		//myPrinter.modelNumber = "New VALUE";
		
		
		//myPrinter.printColor();
		myPrinter.loadPaper(2);
		myPrinter.print(4);

		
	}
}
