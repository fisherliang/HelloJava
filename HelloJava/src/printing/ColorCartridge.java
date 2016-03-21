package printing;

public enum ColorCartridge implements ICartridge {
	
	red, 
	blue,
	green,
	yellow;
	
	@Override
	public String toString(){
		return "Color";
	}
	
	@Override
	public String getFillPercentage(){
		return "97%";
	}

}
