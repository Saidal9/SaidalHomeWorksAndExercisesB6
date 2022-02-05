package day19StringClass;

public class StringHWQ11 {
	public static void main(String[] args) {
		// I have to make class object so i can access threeEqual method(non-static)
		// inside static method(main method/programsMainMachine)

		// syntax for making classObject ..> ClassName ObjectName(descriptiveName) =
		// new(JavaKeyWord) ClassNameAgain ();
		StringHWQ11 objectForMethodAccess = new StringHWQ11();
//I need a new variable so we can pass and take values/results from/to method we want to pass/get values/results to/from.
		String dataToBePassed = objectForMethodAccess.threeEqual("Java Pro", 'P', 'B');
		String dataToBePassed2 = objectForMethodAccess.threeEqual("Lazy mode", 'm', 'C');
		String dataToBePassed3 = objectForMethodAccess.threeEqual("Training", 'T', ' ');

		System.out.println(dataToBePassed);
		System.out.println(dataToBePassed2);
		System.out.println(dataToBePassed3);
	}

	// A method that takes three parameters. One String parameter, 2 character parameters:
	protected String threeEqual(String str, char oldChar, char newChar) {
	//we need a variable to take our results back out of the method, that is the reason we name this variable result.In my opinion:)
		String result = null;
			//replace method is one of the string class methods which, as the name states, gives us the possibility to replace a specific value to another new value.
		result = str.replace(oldChar, newChar);
	//return (JavaKeyword) is important to type in methods that needs to return pass values back to main method.
		return result;

	}

}
/*
 * Write a method that takes three parameters. One String parameter, 2 character
 * parameters. The method replaces old character (parameter 2) from String
 * parameter with new character (parameter 3) and returns the new string
 * 
 * Access Modifier: protected Non-Access Modifier: non-static Return Type:
 * String Method Name: threeEqual Parameter1: String str Parameter2: char
 * oldChar Parameter3: char newChar Test Data: threeEqual (“Java Pro”, ’P’, ‘B‘)
 * ----- Java Bro threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod threeEqual
 * (“Training”, ‘T’, ‘ ‘) ----- raining
 */