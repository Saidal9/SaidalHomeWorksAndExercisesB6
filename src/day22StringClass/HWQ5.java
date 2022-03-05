package day22StringClass;

public class HWQ5 {				//main method is a must have for every program.
	public static void main(String[] args) {
		
		//String variable is needed to pass/print values from removeSpace method
//Note : i created removeSpace method first then i used(passedValues) in it, from main method.
		String dataToBeTrimmed = removeSpace(null);
		System.out.println(dataToBeTrimmed);
		
		String dataToBeTrimmed2 = removeSpace(" Java Training ");
		System.out.println(dataToBeTrimmed2);
		
		String dataToBeTrimmed3 = removeSpace(" I like to practice ");
		System.out.println(dataToBeTrimmed3);
	}
//*Write a method to trim any leading or trailing whitespace from a given string
//in order to create a method, we should know its elements(Modifiers,ReturnType,MethodName)
	public static String removeSpace (String strOne) {
		String result = null;
		
	//To avoid null error in the output(Console), we should place instruction..
//Using if-else instruction(statement):
		if (strOne != null) {//if(value(strOne value) is not(!=) null then {...
			result = strOne.trim();
		}
		else {//else if not that (first if)^,is(strOne value is null,return null
			result = null;
		}
		
		return result; 
	}
}
/*Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (null”) ----- null
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice*/