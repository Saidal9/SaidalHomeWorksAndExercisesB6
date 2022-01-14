package day9BrokenCode;

public class Day9BrokenCodeHomeWork {
	// modifier of method should be typed first then the rest elements of the
	// method.
	//Ctrl + Shift + F : to make the code format differ from ordinary format, for readability.
	
	// String should always start with Upper case example : (String).
	
	public static void  main(String[] args) 
	{
		//int can not store numbers with decimal point or dots. To store values with decimal points we need to use data type Double.
		
		double tempOne=84.7;
		 int tempTwo =66;
		
		 //we can only use (boolean) data type to store result of true and false.
		 
		boolean result;
		
		//logical operator (and) needs to be written as : &&. We should not use double quotation mark in condition checking operators(true and false)
		// we should use (greater than or less than) sign first then equal sign.
		
		if (tempOne <= 0 && tempTwo >= 100) {
			result = true;
			
			//It should be else if, not if else.
		//comparing signs (< >) greater than(>), and less than (<) sign must be used first before using (is equal):  =  , sign.
			
		} else if (tempOne >= 100 && tempTwo <= 0) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
		//result variable/container should be placed at the end of the branches to collect the result of each branch that is being tested for values.
		
		
		String season = "Monday";
		
//we do not need to assign new value inside switch (controlling expression) because we already know which value we are looking/searching for therefore..
		//We only need to type variable name to look for the value of that particular variable.
		
		switch (season) {
		
		//if the value we are looking for is String type value, then we should type it in double quotation mark " ".
		//for switch cases we need to use colon : to close the case name.
		
		case "fall":
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "s":
			System.out.println("Recovering from cold weather");			
			break;
		case "summer":
			System.out.println("Toooo hot");			
			 
		default:
			System.out.println("Season does not exist!");	
		}
		
		//Java is case sensitive therefor our loop (for) needs to start with lower case such as : for.
		//variable initialization happens in inside loop parenthesis ( (int i = 0; ) )
		
		for(int i = 0; i <10; i++){
			
//side note : we can stop at number 10 by providing/typing equal sign next to greater sign "<" so, number<=10
			
			//comparing equalization of two numbers should always be double equal sign without any space.
		//if boolean expression/checking or condition : ( i == 5), should have a statement body to enter from so we need to use curly brackets { after checking condition
			if (i == 5) {
				//The system.out.println should be concluded with a semi colon = ;.
				System.out.println(i + " equals to 5");
			} 
			//else branch does not need parenthesis, parenthesis are used to check if a condition is qualified but else branch is the last option for execution there for there is no need to set condition in else.
			else {
			//printing assigned characters should be inside double quotation mark.
				//our else statement/code should be meaningful and related to other of it's branches (if, else if).
				System.out.println( i + " not equals to 5");
//statements to be executed, provided inside branches, must be descriptive and meaningful. These statements and codes can be excluded from each other with the mark sign plus "+".
				//we can directly print the number/value of variable named : i, without calling it i. But, for that we need to exclude it (i) from the quotation marks. And, enjoin them with +
			}
			
		}

}



}


