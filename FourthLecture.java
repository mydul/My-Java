import java.util.Scanner;

import javax.swing.JWindow;

public class FourthLecture {
	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
//		int a=10,b=20;
		
		int[] numberArray=new int[100];
		int i=100;
		while (i>0) {
			numberArray[i-1]=(i-1)*7;
			i--;
		}
		// Two Dimentional Array
				int[][] twoDarrey=new int[2][4];
				
				twoDarrey[0][0]=1;
				twoDarrey[0][1]=2;
				twoDarrey[0][2]=4;
				twoDarrey[0][3]=5;
				//twoDarrey[row][column]
				twoDarrey[1][0]=2;
				twoDarrey[1][1]=4;
				twoDarrey[1][2]=5;
				twoDarrey[1][3]=9;
				
				//prln("At 2D Array:"+twoDarrey[1][2]);
//				1 2 4 5
//				2 4 5 9
				
//				prln("Please Give Your Input: ");
//				//taking the input
//				for (int row=0; row < 2; row++) {
//					for (int column=0; column < 4; column++) {
//						pr("twoDarrey["+row+"]["+column+"]:");
//						twoDarrey[row][column]=myScanner.nextInt();
//					}
//				}
				//Now printing the tD Array
				int userInput=0;
				try {
//					for (int row=0; row < 2; row++) {
//						for (int column=0; column < 4; column++) {
//							pr(twoDarrey[row][column]+"\t");
//						}
//						prln("\n");
//					}
					pr("Give me anumber:");
					userInput=myScanner.nextInt();
					while (userInput<50) {
						
						prln((100/userInput));
//						pr("Give me anumber:");
//						userInput=myScanner.nextInt();
						userInput++;
					}
					
				} catch (Exception unknownException) {
					unknownException.printStackTrace();
				}
				finally {
//					userInput++;
					prln("Came out of try catch block,with userInput: "+userInput);
				}
				
				
				prln("Thank you for using Program");
		
//		while (i<100) {
//			prln("array ["+i+"] :"+numberArray[i]);
//			i++;
//		}
//		int j=2;
//		do {
//			prln("Do while loop");
//			pr(j);
//			j--;
//		} while (j<2&&j>0);
//		
//		while (j<2&&j>0) {
//			prln("While loop");
//			prln(j);
//			j--;
//		}
		
//		prln(a<b? a:b);
//		prln(compare(a, b));
//		prln(calculateNumber(a, b));
	}
	
	
//	static String compare(int a, int b){
//		if (a<b) {
//			return "A is less than B";
//		}
//		else {
//			return "B is less than A";
//		}
//	}
	static int calculateNumber(int number1,int number2){
		number1+=number2;
		return number1;
	}
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.println(anyObject);
	}
}
