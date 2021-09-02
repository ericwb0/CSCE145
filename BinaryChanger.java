/*
 * Written by Eric Burkholder
 */
import java.util.Scanner;
public class BinaryChanger {

	public static void main(String[] args) {
		//Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program converts two 4-bit binary numbers to base-10 integers, and then adds them.");
		System.out.println("Enter first 4-bit number: ");
		String binaryInput1 = keyboard.nextLine();
		System.out.println("Enter second 4-bit number: ");
		String binaryInput2 = keyboard.nextLine();
		keyboard.close();
		
		//Convert each input Strings into character arrays to make it simpler to iterate through them
		char[] binary1 = binaryInput1.toCharArray();
		char[] binary2 = binaryInput2.toCharArray();
		//Declaring both base-10 ints and setting them to 0 to add each converted base-2 digit to them
		int integer1 = 0;
		int integer2 = 0;
		
		//For loops to iterate through the arrays
		for(int i = 0; i < 4; i++) {
			/*Only need a condition for '1' because we assume that only binary is entered
			 * and the only other option is '0' which wouldn't add anything
			 */
			if(binary1[i] == '1') {
				/*Adds the appropriate power of 2 for the given position in the array
				 * ie. index 0 would be 2^3 position, so I used 2^3-i
				 * Type cast to int because Math.pow() returns a double
				 */
				integer1 += (int)(Math.pow(2, 3-i));
			} 
		}
		
		for(int i = 0; i < 4; i++) {
			if(binary2[i] == '1') {
				integer2 += (int)(Math.pow(2, 3-i));
			} 
		}
		//Summing the integers and printing the integers and the sum
		int sum = integer1 + integer2;
		System.out.println("First integer in base-10: " + integer1 + "\n" + "Second integer in base-10: " + integer2 + "\n" + "Sum: " + sum);
	}
}
