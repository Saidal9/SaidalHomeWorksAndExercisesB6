package day19StringClass;

public class StringHWQ15 {
	public static void main(String[] args) {
		// Calling static inside static, is easy, meaning, we do not have to create class object.

		String removeSpaceData1 = removeSpace(" Java Training    ");
		// I have to create a variable so i can pass and get values to/from method i'm  calling to.
		String removeSpaceSecondData2 = removeSpace("   I   like  to practice      ");

		System.out.println(removeSpaceData1);
		System.out.println(removeSpaceSecondData2);
	}

	// Write a method to trim any leading or trailing whitespace from a given string
	public static String removeSpace(String strOne) {
		String result = null;

		// to trim any leading or trailing whitespace from a given string, we use class of String method called .trim(whichEverStringYouWantToTrim)
		result = strOne.trim();

		// we use return java keyword to return our result variable which is to export our final value from the method.
		return result;
	}
}
/*
 * 
 * Write a method to trim any leading or trailing whitespace from a given string
 * 
 * Access Modifier: public Non-Access Modifier: static Return Type: String
 * Method Name: removeSpace Parameter1: String strOne Test Data: removeSpace (“
 * Java Training ”) ----- java Training removeSpace (“ I like to practice ”)
 * ----- I like to practice
 * 
 */