package greetings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import printing.ColorCartridge;
import printing.Printer;

public class HelloJava {

	public static void main(String[] args)
	{
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", ColorCartridge.blue);
		
		printer.loadPaper(5);
		printer.print(3);
		printer.outPutPage(2);
		
		Path path = Paths.get("D:\\workspace\\SubTest\\newfile.txt");
		
		//Creating a file
		try
		{
			Files.createFile(path);
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
//		//Deleting a File
//		try
//		{
//			Files.deleteIfExists(path);
//		}catch (IOException e){
//			e.printStackTrace();
//		}
		
		//Moving a File
		try
		{
			Files.move(path, Paths.get("D:\\workspace\\SubTest\\movedfile.txt"));
		}catch (IOException e){
			e.printStackTrace();
		}
	}
		
}
