package day8LoopsHomeWork;

public class LoopHomeWorkQ5 {
	public static void main(String[] args) {
		/*
		 * Using for loop, loop through numbers 1-32

1.If the number is even and in the range of 2 to 5
then print “Even number 2-5 “ and the value of number. (numbers between 2

2.If the number is even and in the range of 6 to 20
then print “Even Number 6-20”  and the value of the number


3.If the number is odd and in the range of 15 to 20
then print “Odd Number 15-20” and the value of the number

		 * 
		 * 
		 */
	//* Using for loop, loop through numbers 1-32
		for (int i = 1; i<=32; i++)
//we start our loop with initializing the "starting number", which is 1(in this question), 
//we can stop looping at selected number (32 in this question) by putting the number (32) in boolean expression.
		{
			
			if (i % 2 == 0 && i >= 2 && i<= 5)
//the requirement/question asked at top: If the number is even and in the range of 2 to 5 then print “Even number 2-5 “ and the value of number.
//1- we are asked two things (if the number is even [number(i)%2 ==0], < this << syntax to find even number.
				//And (&&)(number) is in range of: 2>(greater) till(&&) less(<) than 5. 
			{		System.out.println(i + " : Even Numbers 2-5" );
//*********************************************************************************************************************************************			
			//2- same syntax for even number and ranged given numbers(required part2)..>
			} else if (i % 2 == 0 && i >= 6 && i <=20) {
				System.out.println(i + " : Even Number 6-20");
	//*****************************************************************************************************************************************
				
//syntax to know/find odd number, we just need to use the same syntax that helps with finding even number, same syntax for odd number but...
				// change euqals(==) to (0), to (1)...
			} else if (i % 2 == 1 && i >= 15 && i <= 20) {
				System.out.println(i + " : Odd Number");
			}
		}

	}
}
//thank you guys, regards.