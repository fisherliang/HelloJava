package printing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@PrintingDevice(defaultPrintMethod = "print", defaultNumberOfCopies = 5)

public class Printer<T extends ICartridge> implements IMachine {
	
	private String modelNumber;
	private PaperTray PaperTray = new PaperTray();
	private Machine machine;
	private T cartridge;
	//private List<Page> pages = new ArrayList<Page>();
	private Map<Integer,Page> pageMaps = new HashMap<Integer,Page>();
	
	
	public Printer(boolean isOn, String modelNumber, T cartridge){
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
	
	@Override
	public void turnOn(){
		System.out.println("Warming up printer.");
		machine.turnOn();
	}
	
	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
	{
		//System.out.println(cartridge.toString());
		System.out.println(message);
		//System.out.println(cartridge.toString());
		
	}
	
	public void print(int copies)
	{
		
		//checkCopies(copies);
		
		String onStatus = "";
		
		if(machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off.";
		
		String textToPrint = getTextFromFile();
		int pageNumber = 1;
		

		while(copies>0 && !PaperTray.isEmpty())
		{
			//System.out.println(textToPrint);
			//pages.add(new Page(textToPrint));
			pageMaps.put(pageNumber, new Page(textToPrint + ":" + pageNumber));
			copies--;
			pageNumber++;
			PaperTray.usePage();
		}
		
		if(PaperTray.isEmpty())
			System.out.println("Reload the PaperTray");
		}
	
		private String getTextFromFile() {
			FileReader reader = null;
			BufferedReader bReader = null;
			CapitalizationReader capReader = null;
			
			String allText = "";
			
			try {
				reader = new FileReader("D:\\workspace\\SubTest\\test.txt");
				bReader = new BufferedReader(reader);
				capReader = new CapitalizationReader(bReader);
				
				String line;
				
				while((line = capReader.readLine()) != null)
				{
					allText += line + "\n";
				}
				
				return allText;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(capReader != null)
					try {
						capReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return "";
	}

		public void outPutPage(int pageNumber)
		{
			//System.out.println(pageMaps.get(pageNumber).getText());
			PrintWriter writer = null;
			try
			{
				writer = new PrintWriter(new FileWriter("D:\\workspace\\SubTest\\outPutPage.txt"));
				writer.println(pageMaps.get(pageNumber).getText());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(writer != null)
					writer.close();
			}
			
		}
		

	@SuppressWarnings("unused")
	private void checkCopies(int copies) {
		if(copies<0)
			throw new IllegalArgumentException("Can't print less than 0 copies.");
	}
	
	
	public void printColor(){
		String[] colors = new String[] {"red","blue","green"};
		
		//for each example
		for(String currentColor : colors){
			if("green".equals(currentColor))
				break;
			System.out.println(currentColor);
		}
	}
	
	private void print(String text)
	{
		System.out.println(text);
	}
	
	public String getModelNumber()
	{
		return modelNumber;
	}

	public void loadPaper(int count) {
		// TODO Auto-generated method stub
		PaperTray.addPaper(count);
		
	}
	
	public T getCartridge(){
		return cartridge;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		machine.turnOff();
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return machine.isOn();
	}
}
