package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration");
		System.out.println("Enter Your Phone Number::");
		Scanner sc = new Scanner(System.in);
		String phoneNumber = sc.nextLine();
		//91 7895809385

		String regex = "^[0-9]{2}\\s{0,1}[0-9]{10}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid Phone Number!!!");
		else
			System.out.println("Invalid Phone Number!!!");
		sc.close();

	}

}
