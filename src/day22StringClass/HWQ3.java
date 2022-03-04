package day22StringClass;

public class HWQ3 {
	public static void main(String[] args) {
		
		//creating object of the class so I can access non-static method(threeEqual) from static method(main).
		HWQ3 objectToAccessMethod = new HWQ3();
		
//String variable is needed in order to pass, retrieveResults and print values to the method we want to use(threeEqual).	
		String testData = objectToAccessMethod.threeEqual(null, 'P', 'B');
		String testData2 = objectToAccessMethod.threeEqual("Java Pro", 'P', 'B');
		String testData3 = objectToAccessMethod.threeEqual("Lazy mode", 'm', 'C');
		String testData4 = objectToAccessMethod.threeEqual("Training", 'T', ' ');
		
		//Printing values/results of each testData variables that we have created to print the results.
		System.out.println(testData);
		System.out.println(testData2);
		System.out.println(testData3);
		System.out.println(testData4);
	}
//the question is asking :
//Write a method that takes three parameters:
	protected String threeEqual (String str, char oldChar, char newChar) {
		String result = null;
		
		if (str == null) { //in order to handle/avoid null error, I have to create the null value handling if-else statement(if we pass null, return null).
			return null;
		} else {
//replaces old character String parameter with new character
		result	= str.replace(oldChar, newChar);
		}
		
		return result;
	}
}
/*3. Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data:
threeEqual (null, ’P’, ‘B‘) ----- null
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining*/