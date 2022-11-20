package FifthLecture;

public class SubCarClass extends CarClass {

	private float chargeInBattery;
	private String colorString;
	public SubCarClass() {
		super();
	}
	public SubCarClass(String manu,String model,String key,int cc,float fl,float charge,String color) {
		super(manu,model,key,cc,fl);
		chargeInBattery=charge;
		colorString=color;
	}
	public SubCarClass(String manu,String model,String key,int cc,float fl,float charge,String color,int year) {
		super(manu,model,key,cc,fl,year);
		chargeInBattery=charge;
		colorString=color;
	}
	
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}


	public String getColorString() {
		return colorString;
	}
	
	@Override
	public void printAllInfo() {
		super.printAllInfo();
		runForSeconds(60);
		System.out.println("Amount of Fuel after driving for 60s : "+presentAmountOfFuel()+"L");
		System.out.println("Charge in Battery :"+getChargeInBattery());
		System.out.println("Color of car :"+getColorString());
	}
	
}
