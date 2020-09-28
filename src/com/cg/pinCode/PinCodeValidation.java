package com.cg.pinCode;

import java.util.*;
import java.util.regex.*;

public class PinCodeValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to pincode validation");
		Pattern pincode = Pattern.compile("^[0-9]{6}$");
		System.out.println("Enter the pincode");
		String match = sc.nextLine();
		Matcher matcher = pincode.matcher(match);
		boolean found = matcher.find();
		if (found)
			System.out.println("Match Found");
		else
			System.out.println("Match not found");

	}

}
