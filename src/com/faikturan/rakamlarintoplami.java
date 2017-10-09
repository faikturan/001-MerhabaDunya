package com.faikturan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rakamlarintoplami {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input;
		try {
			System.out.println("This program sums digits of any number provided.");
			System.out.println("Enter number:");
			input = br.readLine();
			int num1 = Integer.parseInt(input);
			int tempNum = num1;
			int sum = 0;
			while (tempNum >= 1) {
				sum = sum + tempNum % 10;
				tempNum = tempNum / 10;
			}
			System.out.println("Number: " + num1+ " Sum of Digits: " + sum);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		

	}

}
