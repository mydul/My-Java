package FifthLecture;

public class CarClass {
	//Public variables
	public String manufactureName;
	
	//Private
	private String modelName;
	private String carKeyValue;
	private float fuelAmount;
	final private float amountOfFuelConsumedPerSecond=0.02f;
	
	//Default
	int engineCC;
	
	//Protected
	protected int manufacturingYear;
	
	public CarClass() {
		manufactureName=new String();
		modelName=new String();
		engineCC=1000;
		fuelAmount=0;
		manufacturingYear=0;
	}
	public CarClass(String carName) {
		manufactureName=new String(carName);
		modelName=new String();
		engineCC=0;
		fuelAmount=0;
		manufacturingYear=0;
	}
	public CarClass(String manu,String model,String key,int engineCC,float fuel) {
		manufactureName=manu;
		modelName=model;
		carKeyValue=key;
		this.engineCC=engineCC;
		fuelAmount=fuel;
		manufacturingYear=0;
	}
	public CarClass(String manu,String model,String key,int engineCC,float fuel,int year) {
		this(manu, model, key, engineCC, fuel);
		manufacturingYear=year;
	}
	
	public float presentAmountofFual(){
		return fuelAmount;
	}
	public String getManufactureName() {
		return manufactureName;
	}
	public String getModelName() {
		return modelName;
	}
	public void addFuel(float fuelAmount){
		this.fuelAmount+=fuelAmount;
	}
	public void runForSecond(int timeInSecond) {
		float usedFuel=timeInSecond*amountOfFuelConsumedPerSecond;
		fuelAmount-=usedFuel;
	}
	public Boolean matchPassWord(String userInput) {
		return userInput.equals(carKeyValue);
	}
	

}
