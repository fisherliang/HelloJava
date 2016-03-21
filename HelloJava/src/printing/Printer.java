package printing;

import java.util.HashMap;
import java.util.Map;

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
		System.out.println(cartridge.toString());
		System.out.println(message);
		System.out.println(cartridge.toString());
		
	}
	
	public void print(int copies)
	{
		
		//checkCopies(copies);
		
		String onStatus = "";
		
		if(machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off.";
		
		String textToPrint = modelNumber + onStatus;
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
	
		public void outPutPage(int pageNumber)
		{
			System.out.println(pageMaps.get(pageNumber).getText());
		}
		

	private void checkCopies(int copies) {
		if(copies<0)
			throw new IllegalArgumentException("Can't print less than 0 copies.");
	}
	
	public void printColor(){
		String[] colors = new String[] {"red","blue","green"};
		
		//for each example
		for(String currentColor : colors){
			if("blue".equals(currentColor))
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
