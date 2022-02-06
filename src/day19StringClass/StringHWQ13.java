package day19StringClass;

public class StringHWQ13 {
	
	public static void main(String[] args) {
		//we should make a class object because to use other non static methods inside static (main) method, we need class object.
		//syntax for making a class object is (StringHWQ13 forMethodAccess = new StringHWQ13();)
		StringHWQ13 forMethodAccess = new StringHWQ13();
		
		//a new boolean variable is needed to pass values and get values to.
		boolean resultOne = forMethodAccess.isStartWith("java training", "ing");
		boolean resultTwo = forMethodAccess.isStartWith("java training", "ja");
		boolean resultThree = forMethodAccess.isStartWith("java training", "java");
		boolean resultFour = forMethodAccess.isStartWith("java training", "train");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		
	}
	
	//Write a method
	boolean isStartWith (String strOne, String strTwo) {
		boolean result = false;
		//Created a variable for returning the value to main method.
		//
		//check whether a given string starts with contents(Characters) of
		//another string																we use startsWith method to see if the given String variable starts with 2nd one.
		if (strOne.startsWith(strTwo)) {
			result = true;
		}
		else {
			result = false;
		}
		
		
		return result;
	}
}
/*13. Write a method to check whether a given string starts with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
*/