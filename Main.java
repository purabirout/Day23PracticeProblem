package com.bridgelabz.userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.userregistration.exception.UserRegistrationException;
import com.userregistration.regularexpression.ConstantRegex;

public class Main {

	public static void main(String[] args) {
		IValid isValidFirstName = (pattern, fName) -> {
			try {
				if(! Pattern.matches(ConstantRegex.FIRST_NAME_REGEX, fName)) 
					throw new UserRegistrationException("Invalid First Name");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidFirstName.validate(ConstantRegex.FIRST_NAME_REGEX, "Rekha"));
		
		IValid isValidLastName = (pattern, lName) -> {
			try {
				if(! Pattern.matches(ConstantRegex.LAST_NAME_REGEX, lName)) 
					throw new UserRegistrationException("Invalid Last Name");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidLastName.validate(ConstantRegex.LAST_NAME_REGEX, "Kallutla"));

		IValid isValidMobileNumber = (pattern, mobileNumber) -> {
			try {
				if(! Pattern.matches(ConstantRegex.MOBILE_NUMBER_REGEX, mobileNumber)) 
					throw new UserRegistrationException("Invalid Mobile Number");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidMobileNumber.validate(ConstantRegex.MOBILE_NUMBER_REGEX, "9059903113"));

		IValid isValidEMail = (pattern, eMail) -> {
			try {
				if(! Pattern.matches(ConstantRegex.USER_EMAIL_REGEX, eMail)) 
					throw new UserRegistrationException("Invalid EMail Address");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidEMail.validate(ConstantRegex.USER_EMAIL_REGEX, "abc@gmail.com"));

		
		IValid isValidPassword = (pattern, password) -> {
			try {
				if(! Pattern.matches(ConstantRegex.PASSWORD_REGEX, password)) 
					throw new UserRegistrationException("Invalid Password");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidPassword.validate(ConstantRegex.PASSWORD_REGEX, "Sweety@sai7"));


	}

}
