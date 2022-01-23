package day10And11MethodsHomework;

public class SleepStatusDay11Q1 {
	public static void main(String[] args) {
		
		SleepStatusDay11Q1 objectForCalling = new SleepStatusDay11Q1();
			
		boolean amIsleeping = objectForCalling.sleepIn(false, true);
		System.out.println(amIsleeping);
		
		
		
	} 
//I wrote/created a method as the requirement asked, it does not have the first element for creating a method which is access modifier so its default.
//Return type is given to us so lets start typing/creating our method with writing the return type first which boolean,we know its non-static because
//static or non static is not given to us so lets skip (static / non-static ) too alongside with access modifier.
//sleepIn is our method name method name is the third element to create or type a method so sleepIn then the parameters which is given to us in quest.

	boolean sleepIn (boolean isWeekday, boolean isVacation) {
		boolean result = false;
		
		if (isWeekday == false || isVacation == true) {
			System.out.println("It is vacation");
			result = true;
		} else {
			System.out.println("It is not vacation");
			result = false;
		}
		
		
		
		return result;
	}

}
/*1. Write a method that takes Boolean parameters
Method Name: sleepIn
Method Return Type: boolean
Parameter 1 = boolean isWeekday
Parameter 2 = boolean isVacation
The parameter isWeekday is true if it is a weekday, the parameter isVacation is true if we are on
vacation. We sleep in if it is not a weekday
otherwise return false.

if we are on a vacation. Return true if we sleep in

Then call your function from main method: Create a Boolean variable in your main method and assign
the value what sleepIn method returns
• Variable Name: Boolean amIsleeping;
 * 
 */
