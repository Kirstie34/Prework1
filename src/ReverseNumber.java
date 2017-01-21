import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//future reference: hover over errors to see problem - may need to upload from java library
		System.out.println("Enter an integer to reverse: ");
		int n = scnr.nextInt();
		//n will be the number user enters
		//this program will only allow user to enter a number with limited digits
		
		int userNumber = n;
		int reverse = 0;
		
		int remainder;
		
		//while loop will continue as long as user does not enter 0
		while(userNumber != 0){ 
			remainder = userNumber%10;
			reverse = (reverse * 10) + remainder;
			userNumber = userNumber / 10;
			//while loop stops when user number is less than 10 because:
			//number smaller than 10 / 10 will result in 0
			
		}
	System.out.println("Your reversed integer is: " + reverse);
	}
 }
