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
		
		File file = new File("D\\test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new printerException(e, "Other message.");
		}
		
		try{
			printer.print(-1);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
			return;
		}
		finally
		{
			printer.turnOff();
		}

	}

}
