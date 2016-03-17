package printing;

public class Machine implements IMachine {
	
	//private boolean isOn;
	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn;
	}
	
	public void turnOn(){
		isOn = true;
			System.out.println("Machine is On.");
	}
	
	public void turnOff(){
		isOn = false;
		System.out.println("Machine is Off.");
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
	}

}
