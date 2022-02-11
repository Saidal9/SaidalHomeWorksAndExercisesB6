package day22StringClass;

public class HWQ1 {
	
	public static void main(String[] args) {
		//main method is a must have for every program, i have to call toUpper method inside main method for it to work. since main method is static and toUpper is
		//non-static, i need a class object to access non-static inside static.
		
		HWQ1 objectForAccess = new HWQ1();
		//a new variable is needed to pass, get and print the values.
		String resultVariable = objectForAccess.toUpper("Pro");
		System.out.println(resultVariable);
		
		String resultVariableTwo = objectForAccess.toUpper("java");
		System.out.println(resultVariableTwo);
		
		String resultVariableThree = objectForAccess.toUpper(null);
		System.out.println(resultVariableThree);
			
	}
	
	
//Write a method that takes one String parameter
	String toUpper (String strOne) {
		
		//I had to create if(instructions) because without this instruction i was getting error(null point exception), null is an empty space, null is value used for..
		//empty strings, if we tell the main method to change null to upper case, its like we are telling it to change empty space to upper case(impossible).
		//so in order to dont get a null eception error in console, we set instructions. I'm not sure about this approach, i copied someone's video about null.
		if (strOne == null) {
			return strOne=null;
		}
		//we use string class method toUpperCase method to change a string characters all to upper case, as the name states.
		//the method converts the
		//parameter to uppercase and return the new value.
		return strOne.toUpperCase();
		
		
	}
	
}
/**Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING          //typo maybe
toUpper (null) ----- null
**/