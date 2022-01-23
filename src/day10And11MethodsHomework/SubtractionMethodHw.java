package day10And11MethodsHomework;

public class SubtractionMethodHw {

	public static void main(String[] args) {
		SubtractionMethodHw object = new SubtractionMethodHw();
//I had to create class object to get access to default method (difference21) without class object we are not able to use difference21 which is access
//by creating object of the class, it (object of the class) gives us access to default methods (methods with default or no access modifiers).
		int diffTotal = object.difference21(27);

		// the requirement/homework asked to : Create an int variable in your main
		// method and assign the value what difference21method returns.
// we created a variable which is name is diffTotal for collecting (getting) our answer of the passed values to the method difference21. 

		System.out.println(diffTotal);

	}

//we assign value to the selected method whenever we call that method from main method.
	
	
	int difference21(int number) {
		int result = 0;
		
		
//int method type should consist of a variable that returns the value, if we dont have a returning variable the method will not be able to give us value

//question said: return the difference between variable:
		// number(27 for now) and 21 (number-21),
		
		if (number > 21) {
			System.out.println(number - 21);
			
			
//also another requirement of the homework question is : except return double the difference if n is over 21.
//we know number is over (>) or greater than 21 so we take the result variable : it is good we created this variable to return the value, this variable...
//makes our homework easier too like we can double (*2) it's value before it returns the value to main method:...
			
			
			

		}

		result = result * 2;
		return result;
		

	}
}
/*
 * Write a method that takes 1 parameter • Method Name: difference21 • Parameter  1: int number
 *  • Method Return Type: int 
 *  Given an int number, return the difference between variable number and 21 (number-21),
 *  except return double the difference if n is over 21.
 *   Then call your function from main method:
 * Create an int variable in your main method and assign the value what
  difference21method returns • Variable Name: int diffTotal;
 */
