/** This program calculates mileage. 
* Ayan Cooper. 
* 9/6/2022
*/

//Importing Scanner
import java.util.Scanner;
//Creating shell for program
public class Mileage {
	
	public static void main(String[] args)
	{
	// Add your declaration and code here.
		
		//Creating scanner object and connecting to system.in object
		Scanner keyboard = new Scanner(System.in);	
		
		//Variables
			
		double miles; 
		//User input of miles driven.
		double gallons; 
		//User input of gallons used.
		double mpg; 
		//Result of miles driven divided by gallons used (mileage).
		
		//Program explanation & user input
		System.out.println("This program will calculate mileage.");
		System.out.println("Enter miles driven: ");
		miles = keyboard.nextDouble();
		//Reads user's miles driven input
		System.out.println("Enter gallons used: ");
		gallons = keyboard.nextDouble();
		//Reads user's gallons used input
		
		//Miles per gallon calculation
		mpg = miles / gallons;
		//Mileage = miles / gallons
		
		//Account for if user enters 0 gallons used.
		if (gallons == 0) {
			System.out.println("You cannot divide a number by 0. Please use a different number of gallons.");
		}
		//Output mileage.
		else {
		System.out.println("You have a mileage of " + mpg + " miles per gallon");
		}
		
	}
}