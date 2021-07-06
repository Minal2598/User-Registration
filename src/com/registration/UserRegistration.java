package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration");
		System.out.println("Enter Your Email ID::");
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		// abc.xyz@bl.co.in

		String regex = "^[a-zA-Z]+([.+-_][a-zA-Z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([a-zA-Z]+)*$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid Email!!!");
		else
			System.out.println("Invalid Email!!!");
		sc.close();

	}

}
