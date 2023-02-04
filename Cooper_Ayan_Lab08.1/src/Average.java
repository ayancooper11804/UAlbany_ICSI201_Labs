import java.util.Scanner;

public class Average {
	private int[] data;
	private double mean;
	
	/**
	 * Constructor method
	 * Allocates memory for the array
	 * Repeatedly asks user to enter a score (5 times)
	 */
	public Average() {
		Scanner keyboard = new Scanner (System.in);
		
		data = new int[5];
		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter score number " + (i + 1) + ": ");
			data[i] = keyboard.nextInt();
		}
		 calculateMean();
		 selectionSort();
	}
	
	public void calculateMean() {
		
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		mean = total / (data.length);
		
	}
	
	public void selectionSort() {
		int startScan, index, minIndex, minValue;
		
		for (startScan = 0; startScan < data.length - 1; startScan++) {
			minIndex = startScan;
			minValue = data[startScan];
			for (index = startScan + 1; index < data.length; index++) {
				if (data[index] > minValue) {
					minValue = data[index];
					minIndex = index;
				}
			}
			data[minIndex] = data[startScan];
			data[startScan] = minValue;
		}
	}
	
	public String toString() {
		String output = new String("");
		
		for (int i = 0; i < data.length; i++) {
			output += data[i] + " ";
		}
		output = ("The data in descending order is: " + output + " \nMean: " + mean);
		return output;
	}
}
