package com.classquestions;

import java.util.Scanner;

// Calculating the Count of Character in the string

public class CountingTheString {
public static void main(String[] args) {
	
	        // Input From user
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Initialize counters
	        int letterCount = 0;
	        int digitCount = 0;
	        int specialCharCount = 0;
	        
	        // Iterate through each character in the string
	        for (int i=0;i<input.length();i++) {
	        	 char ch = input.charAt(i); 
	            int asciiValue = (int) ch; // Get ASCII value of the character
	            
	            // Check if the character is a letter (A-Z or a-z)
	            if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
	                letterCount++;
	            }
	            // Check if the character is a digit (0-9)
	            else if (asciiValue >= 48 && asciiValue <= 57) {
	                digitCount++;
	            }
	            // If it's neither a letter nor a digit, it's a special character
	            else {
	                specialCharCount++;
	            }
	        }
	        
	        // Display results
	        System.out.println("Total number of alphabetic letters: " + letterCount);
	        System.out.println("Total number of digits: " + digitCount);
	        System.out.println("Total number of special characters: " + specialCharCount);
	        
	        scanner.close();
	    }
	}

