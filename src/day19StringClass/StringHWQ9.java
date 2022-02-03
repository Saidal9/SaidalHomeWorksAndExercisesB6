package day19StringClass;

public class StringHWQ9 {
		
	//i'm creating main method because it is a must have for every program to run specific operations.
	
	//i have to create class object so i can access object/properties of this class.(static non static rules have applied). to overcome those rules lets make a classObj
	
	public static void main(String[] args) {
		StringHWQ9 objectToAccess = new StringHWQ9();
		
		boolean testData1 =objectToAccess.isThere("java training", "ini");
		boolean testData2 =objectToAccess.isThere("java training", "ava");
		boolean testData3 =objectToAccess.isThere("java training", "AVA");
		boolean testData4 =objectToAccess.isThere("java training", "Java");
		
		System.out.println(testData1);
		System.out.println(testData2);
		System.out.println(testData3);
		System.out.println(testData4);
	}
	//Write a method that takes two String parameters 		and
	private boolean isThere (String strOne, String strTwo) {
		boolean result = false;
		
	//and the method checks if a given
	//String contains the specified sequence of character values. (would have been clearer if it said:if a given string contains ...bla bla bla... of another string.
		
 //To find if one variable contains the sequence of another variable, we use of the methods of String class, we don't have to create this method it is already provided.
	
	// variable.contains(specifiedVariable/characters) helps us to do this particular question. 
		if (strOne.contains(strTwo)) {
			//we use the if body to the instructions of given requirement. We said that if (this is true) then do { this } (return true, in this specific case).
			// Return true if it contains the
			// value. 
	
			result = true;
		}
		
		
		
		
		return result;
	}

}
/*Write a method that takes two String parameters and the method checks if a given
String contains the specified sequence of character values. Return true if it contains the
value otherwise false

Access Modifier: private
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThere
Parameter1: String strOne
Parameter2: String value
Test Data:
isThere (“java training”, “ini”) ----- TRUE
isThere (“java training”, “ava”) ----- TRUE
isThere (“java training”, “AVA”) ----- False
isThere (“java training”, “Java”) ----- False

*/