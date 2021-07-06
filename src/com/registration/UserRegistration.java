package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration");
		System.out.println("Enter First Name of User::");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();


		String regex = "^[A-Z]([a-z]{2})+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid firstName");
		else
			System.out.println("Invalid firstName");
		sc.close();
		
	}

}
