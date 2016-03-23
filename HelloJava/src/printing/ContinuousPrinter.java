package printing;

public class ContinuousPrinter implements Runnable {
	
	private Printer<ICartridge> printer = new Printer<ICartridge>(true, "IPrint", ColorCartridge.blue);

	@Override
	public void run() {

		for(int i=0;i<100;i++)
			printer.printUsingCartridge(ColorCartridge.blue, "In Thread " + i);
		
	}

}
