package com.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration");
		System.out.println("Enter Your PassWord::");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		
		String regex = "^[0-9A-Z]{1}+([0-9a-zA-Z]{8,})*$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid Password!!!");
		else
			System.out.println("Invalid Password!!!");
		sc.close();

	}

}
