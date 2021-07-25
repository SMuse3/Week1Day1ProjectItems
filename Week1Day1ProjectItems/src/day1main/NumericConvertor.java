package day1main;

import java.util.Scanner;

public class NumericConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP create a Numeric Data Convertor //
		
		// step 1. collect input from user console
				Scanner input = new Scanner(System.in);
				System.out.println("--------------------------------");
				System.out.println(" :: Welcome to numeric convertor :: ");
				System.out.println(" :: Enter a integer number vaule :: ");
				System.out.println("--------------------------------");
				int userInput = input.nextInt();
				input.close();
				
				
				// step 2. convert user input into different 
				// implicit type cast
				long bigValue = userInput;
				float floatValue = userInput;
				double doubleValue = userInput;
				
				// explicit type cast
				byte byteValue = (byte) userInput;
				short shortValue = (short) userInput;
				
				System.out.println("-----Implict & Explicit Converted values -----");
				System.out.println("-----Explicitly Converted values -----");
				System.out.println("Byte Value : "+byteValue);
				System.out.println("Short Value : "+shortValue);
				System.out.println("-----Implictly Converted values -----");
				System.out.println("Long Value : "+bigValue);
				System.out.println("Float Value : "+floatValue);
				System.out.println("Double Value : "+doubleValue);

	}

}
