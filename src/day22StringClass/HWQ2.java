package day22StringClass;

public class HWQ2 {

	// main method is required for every program
	public static void main(String[] args) {
		// main method is static, the method we are trying to use inside main
		// method(static), is non-static so we need class object so we can access the
		// non static method inside static method (main)

		HWQ2 objectForMethodAccess = new HWQ2();

		// we need a variable to pass, get and print values from/to isEndWith method.
		boolean testData = objectForMethodAccess.isEndWith("java training", "ing");
		boolean testData2 = objectForMethodAccess.isEndWith("java training", "ng");
		boolean testData3 = objectForMethodAccess.isEndWith("java training", "java");
		boolean testData4 = objectForMethodAccess.isEndWith("java training", "train");
		boolean testData5 = objectForMethodAccess.isEndWith(null, "java");
		boolean testData6 = objectForMethodAccess.isEndWith(null, null);
		boolean testData7 = objectForMethodAccess.isEndWith("aaabc", "abc");
		boolean testData8 = objectForMethodAccess.isEndWith("abc", null);

		System.out.println(testData);
		System.out.println(testData2);
		System.out.println(testData3);
		System.out.println(testData4);
		System.out.println(testData5);
		System.out.println(testData6);
		System.out.println(testData7);
		System.out.println(testData8);

	}

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;

		if (strOne == null || strTwo == null) {
			return false;
		} else if (strOne.endsWith(strTwo)) {
			result = true;
		} else {
			return false;
		}
		return result;
	}

}

/**
 * 
 * Write a method to check whether a given string ends with the contents(Characters) of another String.
 *  Access Modifier: default
 *   Non-Access Modifier: non-static
 *    Return Type: boolean
 *     Method Name: isEndWith
 *      Parameter1: String strOne Parameter2: String strTwo
 *       Test Data: isEndWith (“java training”, “ing”) ----- TRUE
 *        isEndWith (“java training”, “ng”) ----- TRUE
 * isEndWith (“java training”, “java”) ----- False
 *  isEndWith (“java training”,“train”) ----- False
 *   isEndWith (null , “java”) ----- False
 *    isEndWith (null , null) ----- False
 *     isEndWith (“aaabc”, “abc”) ----- TRUE
 *      isEndWith (“abc”, null) ----- False
 **/