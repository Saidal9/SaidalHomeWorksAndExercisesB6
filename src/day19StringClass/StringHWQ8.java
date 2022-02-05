package day19StringClass;

public class StringHWQ8 {
	public static void main(String[] args) {
		// we can use our other method(getCharacter) from our main method, we can pass
		// values to its parameters from main method.
		// String values to be passed, should be with double quotes.
		
		char dataToGetChar = getCharacter("java training", 2);
		char dataToGetChar2 = getCharacter("java training", 5);
		char dataToGetChar3 = getCharacter("java training", 8);
		char dataToGetChar4 = getCharacter("java training", 22);

		System.out.println(dataToGetChar);
		System.out.println(dataToGetChar2);
		System.out.println(dataToGetChar3);
		System.out.println(dataToGetChar4);
	}

	// Write a method that takes two parameters
	// one String parameter and one integer parameter
	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		// The method should return the character at the given index within the String.
		// we use one of the string class method for getting the <<specific character>>
		// at <<specific index number>>

		if (indexNum >= strOne.length()) {

			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}


		// If the indexNum more than the length of String then return ‘?’ mark

		
		return result;

	}
}
/*
 * Write a method that takes two parameters, one String parameter and one
 * integer parameter. The method should return the character at the given index
 * within the String. If the indexNum more than the length of String then return
 * ‘?’ mark
 * 
 *
 * getCharacter (“java training”, 2) ----- v
 *
 * getCharacter (“java training”, 5) ----- t getCharacter (“java training”, 8)
 * ----- i getCharacter (“java training”, 22) ----- ?
 */