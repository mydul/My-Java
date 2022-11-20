package Sixthlecture; 

//import FifthLecture.SubCarClass;
import FifthLecture.*; // If we want IMPORT OurSelf

public class SixthLecture {

	public static void main(String[] args) {
		CarClass aCar=new CarClass("MITSUBISHI", "lancer", "Icche", 2500, 15, 2015);
		SubCarClass aSubCar=new SubCarClass("NISSAN", "350z", "rs", 4000, 50, 12, "Grey", 2011);

		AnotherSubCar sixthLectureCar=new AnotherSubCar("Porsxhe", "CareeraGT", "xcvghbjnk", 4000, 100, 2016);
		
		sixthLectureCar.printAllInfo();
		
		aSubCar.manufactureName="Mercedes Benz";
		aSubCar.printAllInfo();
		aCar.printAllInfo();
		
		sixthLectureCar.addAmountOfFuel(12);
		System.out.println("\n\n Fuel :"+sixthLectureCar.presentAmountofFual());
		System.out.println("Model Name :"+sixthLectureCar.getCarModelName());
		System.out.println("Year: "+sixthLectureCar.getManufacturingYear());
	}

}
