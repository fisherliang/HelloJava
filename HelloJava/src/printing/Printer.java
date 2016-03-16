package printing;

public class Printer extends Machine {
	
	//public boolean isOn;
	private String modelNumber;
	private PaperTray PaperTray = new PaperTray();
	
	public Printer(boolean isOn, String modelNumber){
		//this.isOn = isOn;
		super(isOn);
		this.modelNumber = modelNumber;
	}
	
	@Override
	public void turnOn(){
		System.out.println("Warming up print engine.");
		super.turnOn();
	}
	
	public void print(int copies)
	{
		//System.out.println(isOn);
		//System.out.println(modelNumber);
		
		String onStatus = "";
		
		if(isOn)
			onStatus = " is On!";
		else
			onStatus = " is Off.";
		
		String textToPrint = modelNumber + onStatus;
		
		//for(int i = 0;i<copies;i++)
		while(copies>0 && !PaperTray.isEmpty())
		{
			System.out.println(textToPrint);
			copies--;
			PaperTray.usePage();
		}
		
		if(PaperTray.isEmpty())
			System.out.println("Reload the PaperTray");
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
}
