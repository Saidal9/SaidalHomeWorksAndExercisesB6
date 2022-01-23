package day10And11MethodsHomework;

public class MonkeyStatus {
	public static void main(String[] args) {
		
		/**
		 * Write a method that takes two Boolean parameters
• Method Name: monkeyTrouble
• Method Return Type: Boolean
• Parameter 1: Boolean aSmile
• Parameter 2: Boolean bSmile
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We
or if neither of them is smiling. Return true if we are in trouble

otherwise return false

Then call your function from main method: Create a Boolean variable in your main method and assign
the value what monkeyTrouble method returns
• Variable Name : Boolean areWeInTrouble;
		 */
		
		
		
		
		boolean areWeinTrouble = monkeyTrouble (true,true);
		
		System.out.println(areWeinTrouble);
		
		
	} public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
		//we wrote a method that has boolean return type (return variable inside this method is must have for the returning of value)
		//requirement asked to assign two boolean parameters in method
		//MEthod name was given to us and it is monkeyTrouble
		
		
		boolean result = true;
//boolean is return type so return variable inside the method should match exactly as the method (return) (datatype).
		if (aSmile == true && bSmile == true) 
	//requirement or homework question is asking : return true if both are smiling,
			// we already know both are smiling because we passed (true) value from our main method body.
		{
			System.out.println("We are in touble if both are smiling");
			result = true;
		// so result should be/return true Or(we are in trouble if both are smiling).
		} else if (aSmile == true && bSmile == false) {
	//if one is smiling^ and other is not smiling^then: 		
	System.out.println("We are not in trouble");
	result = false;
		}
	//we are in trouble if both are not smiling:
	if (aSmile == false && bSmile == false) {
		System.out.println("Both are not smiling, we are in trouble");
		result = true;
		
	}
		
	
		return result;
	}
}
