package day10And11MethodsHomework;

public class Day12Q1 {
	public static void main(String[] args) {
		
		Day12Q1 objectToAccessposNegMethod = new Day12Q1();
		boolean trueOrFalse = objectToAccessposNegMethod.posNeg(-27, 128, false);
		
		boolean secondTestingValues = objectToAccessposNegMethod.posNeg(-10, -40, true);
		
		boolean testingValueThree = objectToAccessposNegMethod.posNeg(4, -5, true);
		
		
		
		System.out.println(trueOrFalse);
		
		System.out.println(secondTestingValues);
		
		System.out.println(testingValueThree);
		
	} boolean posNeg (int valueOne, int valueTwo, boolean valueThree ) {
		
		boolean result = false;
		
		if (valueOne < -0 && valueTwo > -0 && valueThree == false) {
			result = true;
		} else if (valueOne < 0 && valueTwo < -0  && valueThree == true) {
			result = true;
		}
		
		
		return result;
	}
}
/*1) Given 2 int values and 1 boolean value, return true if one is negative and one is positive and
boolean value is false. Except if the boolean parameter is true, then return true only if both
are negative.
posNeg (1, -1, false) ---  true
posNeg (-1, 1, false) ---  true
posNeg (-4, -5, true) ---  true
Different typing than what is provided for answers. Results may vary depending on passed values.

*/