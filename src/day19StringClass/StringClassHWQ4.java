package day19StringClass;

public class StringClassHWQ4 {

	public static void main(String[] args) {

		StringClassHWQ4 objectForMethod = new StringClassHWQ4();
		//I mainly created class object^ so i can access the method that is non-static. We will not be able to
		//access/use non-static into static method(our main method is static so). We have to create classObject In order to use non static inside main method which is STC

		// ?? I had to create separate variables to get results, i'm not so sure why but lets say: we have to do it for passing datas, < PLEASE HELP CLARIFY >  
		String dataForTesting1 = objectForMethod.toUpper("Pro");
		String dataForTesting2 = objectForMethod.toUpper("java");
		String dataForTesting3 = objectForMethod.toUpper("java training");

		System.out.println(dataForTesting1);
		System.out.println(dataForTesting2);
		System.out.println(dataForTesting3);
		
		
	}
	
	
	// Write a method that takes one String parameter
//So the method elements are already given to us (which is good for we already have the elements to create the method).
	//Starting with access modifier, the first element to create a method. in this question it is default. We said if its default, we do not write anything for AM(accMod)
		//It (the question) said: a method that takes one String parameter so (String stringName), remember parameters are inside parenthesis .
	String toUpper(String strOne) {
		String result = null;
		// and the method converts the
//parameter to uppercase and return the new String value
		//For converting the parameter(variable) to upperCase, we have to use one of the methods of String class, which is (toUpperCase).
		
		//so StringVariableName dot . toUpperCase , parenthesis openAndClose);

		result = strOne.toUpperCase();

		return result;
	}

}
/*
 Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
 */