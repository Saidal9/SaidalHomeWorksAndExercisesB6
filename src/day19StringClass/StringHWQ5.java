package day19StringClass;

public class StringHWQ5 {
	
	public static void main(String[] args) {
//the main method is static and toLower method is non static, so to access toLower(non-static) from static(main method)...remember we are accessing it from main method...
// because our main method acts as machine to do our main operations, as the name states main method. lets say we are passing values to our other methods from main method
		
//so to access non static into static (main) method, i need class object inside this (static) method so i can access the non static method (toLower) of this class.
	
		//we make a class object with > className first, then objectName (any meaningfulName), then = new(keyword) className (again) ();
		StringHWQ5 objectToAccess = new StringHWQ5();
		
		String dataToBeTested = objectToAccess.toLower("espn");
		String dataToBeTested2 = objectToAccess.toLower("SOCCER");
		String dataToBeTested3 = objectToAccess.toLower("STRING CLASS");
		
		System.out.println(dataToBeTested);
		System.out.println(dataToBeTested2);
		System.out.println(dataToBeTested3);
		
	}
//1. Write a method that takes one String parameter,
	protected String toLower (String strOne) {
		String result = null;
	//2.and the method converts the parameter to lowercase,
		result = strOne.toLowerCase();
		
		//3.return the new String value
		
		return result;
	}//the only thing i don't understand is where to place my printer(sysOUTPRINT), 

}
/*
 * Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data:
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class
 */

