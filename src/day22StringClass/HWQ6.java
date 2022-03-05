package day22StringClass;

public class HWQ6 {
	//main method is a must have test/exhibit this exercise
	public static void main(String[] args) {
	//Class object is needed to call/use non-static method(endsWithNG) inside static(main)method.
	HWQ6 objectToAccessMethod = new HWQ6();	
	
		boolean valueToCheck = objectToAccessMethod.endsWithNG(null);
		System.out.println(valueToCheck);
		
		boolean valueToCheck2 = objectToAccessMethod.endsWithNG("I like to practice");
		System.out.println(valueToCheck2);
		
		boolean valueToCheck3 = objectToAccessMethod.endsWithNG("Everyone is practicing");
		System.out.println(valueToCheck3);
		
		boolean valueToCheck4 = objectToAccessMethod.endsWithNG("I am studying");
		System.out.println(valueToCheck4);
	}
//Write a method that takes a string parameter and return true if...
//the string parameter ends in "ng"
	public boolean endsWithNG(String strOne) {
		boolean result = false;
//if we pass null, we will get null error, we want to avoid this error, how?
//by using if-else statement we can pass this error as null value.
		if (strOne == null) {//if (strOne is null) then { return false }
			result = false;
		} else {//else(if strOne is other than null) then{boolean_expression strOne (check if endsWith.}
			result = strOne.endsWith("ng");
		}
		
		
		return result;
	}
}
/*Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
Test Data:
endsWithNG (null) ----- FALSE
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE*/