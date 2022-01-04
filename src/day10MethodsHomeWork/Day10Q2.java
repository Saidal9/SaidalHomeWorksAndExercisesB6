package day10MethodsHomeWork;

public class Day10Q2 {
	public static void main(String[] args){
		
		//Q2. Write a method that takes 1 char parameter.
		//The method should print the full gender (Female, Male) based on the character passed.
		//If user enters invalid gender character, then it should print error message
					
		getGender('m', 'f');
	}			//Two values (m, f) for our Two parameters(char (gender), char2 (genderTwo)

	public static void getGender(char gender, char genderTwo)

	{
		//if gender value is passed to parameters one then it should print male
		if (gender == 'm') {
			System.out.println(gender + ": Male");

		} else if (gender == 'f') {
			System.out.println(genderTwo + " Female ");

		} else {
			System.out.println("Error");
		}
	}

}
//Not so sure about this one as well. please help, much thanks.