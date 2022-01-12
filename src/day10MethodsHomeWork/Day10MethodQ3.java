package day10MethodsHomeWork;

public class Day10MethodQ3 {
	public static void main(String[] args)

{
		oddEven(4); //when execution happens : 4 get's stored in method {oddEven int number}.
	oddEven(3); //oddEven method is called from main^method(caller method)
}
	
	//we create our methods by looking/knowing it's elements :
	//its elements are : modifier (public static), return type(void), method(name),parameters(variables) << skeleton of the method.
	  public static void oddEven (int number) {
		if (number % 2 == 0) 
	//we have settled two functions in the upper Condition:
	//we use % 2 to find remainder and:
	// we use == 0 to know if the number is even.
		{
			System.out.println("The number " + number + ": is even");
//  if the number is equal( == 0 ) then print^ = "the number is even"
			
		} else if (number % 1 == 0) {
	//we can find if the number is odd(remainder of modulo sign% gives us a remainder other than 0) then we can say this number is odd.
	
			System.out.println("the number " + number + ": is odd");
		} else {
			System.out.println("Check conditions");
		}
	}
}
//question should have been at top to compare without any problem, accept my apology for putting the question/logic at bottom.
/**Write a method that takes 1 parameter. In the method write the following logic.
If the parameter is even, then print the number is an even number
If the parameter is odd, then print the number is an odd number

*/