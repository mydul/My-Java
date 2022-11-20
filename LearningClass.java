package FifthLecture;

public class LearningClass {

	private int aNumber=12;
	private int anotherNumber;
	static private CarClass ourCar=new CarClass();
	static private CarClass ourAnotherCar;
	public static void main(String[] args) {
		
		CarClass thirdCar=new CarClass("Lamborgini", "65699LN", "sonamoni", 5000, 100);
		
		SubCarClass ourSubCar=new SubCarClass("Ferari", "9 series", "MIRSAS", 3000, 50, 12, "Red");
		
		ourAnotherCar=new CarClass("TOYOTA", "Allion", "rashed", 1500,30);
		//1st Car
		ourAnotherCar.printAllInfo();
		
		// Our Third Lamborgini Car which we brought last months
		
		System.out.println("\n\nManufacturer : " +thirdCar.manufactureName);
		System.out.println("Model Name: " +thirdCar.getModelName());
		System.out.println("Password Match :"+thirdCar.matchPassWord("sonamoni"));
		
		System.out.println("2nd car CC :"+thirdCar.engineCC);
		System.out.println("Amount of Fuel :"+thirdCar.presentAmountofFual()+" Liter");
		thirdCar.addFuel(2);
		System.out.println("Amount of Fuel after addind 2 litter:"+thirdCar.presentAmountofFual()+" Liter");
		thirdCar.runForSecond(60);
		System.out.println("Amount of Fuel after driving for 60 sec:"+thirdCar.presentAmountofFual()+" Liter");
	
		System.out.println("\n\n");
		// Our Third Ferari Car
		
			System.out.println("\n\nManufacturer : " +ourSubCar.manufactureName);
			System.out.println("Model Name: " +ourSubCar.getModelName());
			System.out.println("Password Match :"+ourSubCar.matchPassWord("sonamoni"));
				
			System.out.println("2nd car CC :"+ourSubCar.engineCC);
			System.out.println("Amount of Fuel :"+ourSubCar.presentAmountofFual()+" Liter");
			ourSubCar.addFuel(2);
			System.out.println("Amount of Fuel after addind 2 litter:"+ourSubCar.presentAmountofFual()+" Liter");
			ourSubCar.runForSecond(60);
			System.out.println("Amount of Fuel after driving for 60 sec:"+ourSubCar.presentAmountofFual()+" Liter");
			System.out.println("Charge in Battery :"+ourSubCar.getChargeInBattery());
			System.out.println("Color of Car: "+ourSubCar.getColorString());
			
			
	}

}
