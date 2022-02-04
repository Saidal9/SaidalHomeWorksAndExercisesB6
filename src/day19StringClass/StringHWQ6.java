package day19StringClass;

public class StringHWQ6 {
	public static void main(String[] args) {
		String combinedTestData = combineStr("day", "ONE", "work", "HOURS");
		String combinedTestData2 = combineStr("week", "weekend", "monday", "Tuesday");
		String combinedTestData3 = combineStr("restoN", "vA", "baltiMORE", "Tuesday");
		String combinedTestData4 = combineStr("java", "is", "fun", "LEARNING");
		
		System.out.println(combinedTestData);
		System.out.println(combinedTestData2);
		System.out.println(combinedTestData3);
		System.out.println(combinedTestData4);
	}
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = null;
		
		String toUpperCase = strOne.toUpperCase() + strThree.toUpperCase();

		String toLowerCase = strTwo.toLowerCase() + strFour.toLowerCase();

		result = toUpperCase.concat(toLowerCase);
		
		
		return result;
	}

}
/*6. Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String
value.

Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
Test Data:
combineStr (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours
combineStr (“week”, “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday
combineStr (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd
combineStr (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning
*/