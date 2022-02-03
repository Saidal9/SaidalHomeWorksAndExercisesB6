package day19StringClass;

public class StringHW7 {
	
	public static void main(String[] args) {
		
		// we need main method to assign value to method helloTo
		
		// we need class object to access non static method inside static.
		
		// we can make class object by className objectName = new ClassName();
		
		//when we make class object, we get access to its methods as well as variables.
		
		StringHW7 objectToAccessMethod = new StringHW7();
		
		String dataToBePassed = objectToAccessMethod.helloTo("Denis");
		String dataToBePassed2 = objectToAccessMethod.helloTo("Malek");
		String dataToBePassed3 = objectToAccessMethod.helloTo("Sara");
		
		System.out.println(dataToBePassed);
		System.out.println(dataToBePassed2);
		System.out.println(dataToBePassed3);
	}
//The question/HW asked : Write a method that takes one String parameter (name)
	String helloTo (String name) {
		String result = null;
		//I had to create string variable Hello so i can append hello to string name
		
		
		String hello = "Hello ";
		//The question/HW asked : and the method returns new String value appending “Hello” to name parameter
		
		//to append/concatenate/sum two strings we can use one of the methods of String class which is stringName.concat("appendMeToIt"/variableName);.
			//appending “Hello” to name parameter
		result = hello.concat(name);
		
		return result;
	}

}
/*Write a method that takes one String parameter (name) and the method returns new
String value appending “Hello” to name parameter

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: helloTo
Parameter1: String strOne
Test Data:
helloTo (“Denis”) ----- Hello Denis
helloTo (“Malek”) ----- Hello Malek
helloTo (“Sara”) ----- Hello Sara
*/