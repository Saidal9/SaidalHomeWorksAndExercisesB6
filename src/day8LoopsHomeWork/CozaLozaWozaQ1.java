package day8LoopsHomeWork;

public class CozaLozaWozaQ1 {
	public static void main (String [] args)
	
	/**Write a program called CozaLozaWoza (class Name) which prints the numbers 1 to 36
	The program shall print "Coza" in place of the numbers which are multiples of 3 ONLY, ( I % 3 ==0)
	"Loza" for multiples of 5 ONLY, ( I % 5 == 0)
	"Woza" for multiples of 7 ONLY, ( I % 7 == 0)
	"CozaLoza" for multiples of 3 and 5
	If the number is not divisible of the above condition, then print the number itself */

	
	{
		for (int i = 1; i<=36; i++)
	//we first have our max^ number to stop printing at, this (max# to stop printing at) should always be in our boolean expression. 
		
		{ //<<// our requirements must be inside loop body
			// For the multiples of 3, we want to print Coza, 
		// My question is : why are we not using * sign but we use the % for finding sum as well as odd and even numbers?
			if (i % 3 == 0) {
				System.out.println("Coza");
				//if the loop is printing numbers of multiplies of 5 then print loza. 
			} else if (i % 5==0) {
				//for the multiplies of 7 loza and so on.
			System.out.println("Loza");
			} else if (i%7==0) {
				System.out.println("Woza");
			} else if (i%3 == 0 && i%5 ==0) {
				System.out.println("CozaLoza");
				//how come in last condition that is given to us use the word divisible but for the rest of the requirements multiply. 
			} else {System.out.println(i);
		}
	}
}
}