package printing;

public enum ColorCartridge implements ICartridge {
	
	red("Red"), 
	blue("Blue"),
	green("Green"),
	yellow("Yellow");
	
	private String colorText;
	
	private ColorCartridge(String colorText)
	{
		this.colorText = colorText;
		
	}
	
	public String notOverriding()
	{
		return "";
	}
	
	@Override
	public String toString(){
		return "Color";
	}
	
	@Override
	public String getFillPercentage(){
		return "97%";
	}

	@Override
	public String printColor() {
		// TODO Auto-generated method stub
		return colorText;
	}

}
