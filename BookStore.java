import java.util.Scanner;

public class BookStore {
	static Scanner myScanner=new Scanner(System.in);

	static String[] books={"Java", "C", "Python"};
	static final double studentDiscount=0.3;
	static final double teacherDiscount=0.4;
	static final double alienDiscount=0.0;
	
	public static void main(String[] args) {
		prln("<><><><>Welcome to our Bookstore<><><><>");
		pr("Which book do you want? \n Ans: ");
		String userChoice=myScanner.nextLine();
		
		if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for "+books[0]+" Book.");
			calculatePrice(books[0]);
		}
		else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for "+books[1]+" Book.");
			calculatePrice(books[1]);
		}
		else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("You opted for "+books[2]+" Book.");
			calculatePrice(books[2]);
		}
		else {
			prln("Sorry, We don't have that book");
		}

	}
	static void calculatePrice(String bookName){
		pr("Are you Student, Teacher or Alien?\n Ans:");
		String answer=myScanner.nextLine();
		double price=200;
		
		if (answer.toLowerCase().equals("teacher")) {
			prln("Predefined Price of this book: "+price);
			price=price-(price*teacherDiscount);
			showPrice(price);
		}
		else if (answer.toLowerCase().equals("student")) {
			prln("Predefined Price of this book: "+price);
			price=price-(price*studentDiscount);
			showPrice(price); 
		}
		else if (answer.toLowerCase().equals("alien")) {
			prln("Predefined Price of this book: "+price);
			price=price-(price*alienDiscount);
			showPrice(price);
		}
		else {
			prln("Sorry, we can't serve you.");
		}
		
	}
	static void showPrice(double price){
		prln("Your total  payable: "+price);
		prln("\n...........THANK YOU FOR SHOPPING FROM OUR BOOKSTORE...........");
	}
	
	// print & println k use er subidhay object creat
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.println(anyObject);
		}

}
