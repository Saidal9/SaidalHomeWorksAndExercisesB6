package day10MethodsHomeWork;

public class MethodHomeWorkQ1 {
	public static void main(String[] args) {
		/**Write a method that takes 3 parameters (2 double value and 1 char value).
		 *  The method should perform calculation (addition, subtraction, multiplication, division and modulus).
		Depending the math operation sign character ( + , -. / , *, %) passed to the method,
		 it should perform appropriate calculation and should print the result of operation.
		If user enters invalid math operation sign, then it should print error message.
*/
		
	//Based on the character | passed to method
//							 .
//							 .		
		calculate(2.2, 1.0, '+');
//+ char is passed a value of+ mathOperationSign (by us). if branching statement finds '+' then it will do the branch requested work.
		calculate(1.1, 0.1, '-');
//we passed the value '-' to calculate method from our main method
		calculate(15.0, 5.0, '/');
// if the char value matches the assigned value in branching statement (calculate branches) then it will do the to-do of that branch. 
		calculate(2.0,3.0,'*');
//first values jumps into first parameters, then the branches are checked for requested signs in mathOperationSign
		calculate(20.20, 20.20, '%');
	//
		calculate(12.20, 34.20, '^');
//Lets assign wrong sign^ on purpose to check if the mathOperationSign still opens the door for to-do list for printing machine.
	}
//first start by writing our method  ..>
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		double total = 0;
	
		if (mathOperationSign == '+') {
			//if the char value is '+' 
			System.out.println("Addition = " + numOne+numTwo + " Operation Sign : " + mathOperationSign);
//								add variable numOne^ with numTwo						print the mathOperationSign which got valued at very beginning.		
		} else if (mathOperationSign == '-') {
//if the assigned value from main method matches this value'-' do the following ...
		System.out.println("Substraction or Difference  :" + total + " Operator Sign: " + mathOperationSign );
		 total = numOne-numTwo;
		} else if (mathOperationSign == '/') {
			System.out.println("Division = / = " + numOne/numTwo + mathOperationSign);
			
		} else if (mathOperationSign == '*') {
			System.out.println("Multiplication = * = " + numOne*numTwo);
			
		} else if (mathOperationSign == '%') {
			
			System.out.println("ModuloOf/RemainderOf : For Finding Even Or Odd, if remainder is 0 :even, other than 0; Odd  : " + numOne%numTwo + mathOperationSign );
		} 
//all the branches are asked to perform math calculation based on first(main method) assigned value of char (mathOperationSign).
//If they(char value) don't match then it will do the else to-do list.
		else {
			System.out.println("Error Message: This Calculation sign is not available");
		}
	}
}
