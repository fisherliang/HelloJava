package printing;

public class Machine implements IMachine {
	
	//private boolean isOn;
	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn;
	}
	
	public void turnOn(){
		isOn = true;
			System.out.println("Machine is on.");
	}
	
	public void turnOff(){
		isOn = false;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
	}

}
