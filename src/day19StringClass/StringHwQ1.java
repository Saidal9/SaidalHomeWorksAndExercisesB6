package day19StringClass;

public class StringHwQ1 {
	
	public static void main(String[] args) {
		
		isEqual("sdet","SDET"); 
		isEqual("testing","testing"); //true
		isEqual("Java","Java"); //true
		isEqual("java","java Programming"); //false
		
	}
//The question asked to write a method that takes two string parameters >>...
							static boolean isEqual (String strOne, String strTwo) {
		
	boolean result = false;
//content wise, we need to check if two parameters (values) are equal.
	if (strOne.equals(strTwo)) {
//we are using java built in method (.equals) which will compare two values (parameters) to check if they are equal or not
		result = true;
//for boolean method type, we always need a variable to collect our result, that is why we name this variable result, and we use the return java keyword
		//to return our result, we place this variable (return) in every branch so it can return/bring the result to return keyword outside the branch

	}
//i had to add printer inside the method so it does not print blank page
	System.out.println(result);
	return result;
	
	
}
}
/*
 * Write a method that takes two String parameter 
 * and checks if the two strings
 * are equal or not. If they are equal return true, otherwise return false
 * Access Modifier: Default Non-Access Modifier: static Return Type: boolean
 * Method Name: isEqual Parameter1: String strOne Parameter2: String strTwo
 *  Test
 * Data: isEqual (“sdet”, “SDET”) ----- FALSE
 *  isEqual (“testing”, “testing”) TRUE
 *   isEqual (“java”, “java”) ----- TRUE
 *    isEqual (“java”, “java
 * Programming”) ----- FALSE
 */
