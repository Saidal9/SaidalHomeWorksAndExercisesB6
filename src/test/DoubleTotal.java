package test;

public class DoubleTotal {
//The requirement/homework asked to call my sumDouble method from main method, but i was not able to because the access type was not given to us(default
//so in this case we need to create class object inside main method (which is static), so in order to access default method from static method we need..
//we need to create class object so we can use the default modifiers method or even variables with default modifiers inside main which is static method.
	public static void main(String[] args) {
//we created a class object so we can have access to default modifiers. since the method we want to use (sumDouble) has restriction for accessing.
		DoubleTotal forUsingMethodSumDouble = new DoubleTotal();
//program parts names should be meaningful that is why i name this particular class object (forUsingMethodSumDouble) to use the class method.
		int myTotal = forUsingMethodSumDouble.sumDouble(2, 2);
		
		int myTotalTwo = forUsingMethodSumDouble.sumDouble(4, 8);
		
		System.out.println(myTotalTwo);

		System.out.println(myTotal);

	}

	int sumDouble(int valueOne, int valueTwo) {
		
		
		int sum = 0;
		
		sum = sum + valueOne + valueTwo;
		//If the two values are the same. Yes, they are the same because I assigned the values 2 and 2 from my main method.
		// (Parameter 1 and Parameter 2), then return double their sum
		if ( valueOne == valueTwo) { 
			sum = sum * 2;
		}
		
		return sum;
		
	}

}

/*
 * Write a method that takes 2 integer parameters • Method Name:sumDouble •
 * Parameter 1: int valueOne • Parameter 2: int valueTwo • Method Return Type:
 * int Given two int values, return their sum. If the two values are the same
 * (Parameter 1 and Parameter 2), then return double their sum. Then call your
 * function from main method: Create an int variable in your main method and
 * assign the value what sumDouble method returns • Variable Name: int myTotal;
 */