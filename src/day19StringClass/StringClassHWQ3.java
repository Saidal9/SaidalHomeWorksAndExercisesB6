package day19StringClass;

public class StringClassHWQ3 {
	
	public static void main(String[] args) {
		isEqualLength("Pro", "Ali");
		isEqualLength("java","learNinG");
		isEqualLength("java training", "java");
		
	}
	//Write a method that takes		 two String parameter
	public static void isEqualLength(String strOne, String strTwo) {
								//and
		//A. checks if the length of parameter one equal to the length of parameter two.
		if (strOne.length() == strTwo.length()) { //a. If they are equal, then concatenate parameter 1 with parameter two
			
	//To concatenate two strings, and return the sum of this two strings, I had to declare another String. Though, I was not sure if this approach is good please confirm.
//Because the requirement/question asked (print the new string value with its length). When it said new, i thought i had to create new String variable. 
			String strForLengthAndNewValue;
			
			strForLengthAndNewValue = strOne.concat(strTwo);
// The length method from string class helped me to print the length of the variable calledStringForLengthAndNewValue.
			//as question asked(print the new string value with its length).
			System.out.println(strForLengthAndNewValue + " : Length : " + strForLengthAndNewValue.length());

												/////////////////
//B. If parameter 1 length is greater than parameter 2
		} else if (strOne.length() > strTwo.length()) {
			String strForLengthAndNewValue2;
			//then print parameter 1 all
			// in uppercase with its length													...
			strForLengthAndNewValue2 = strOne.toUpperCase();
			System.out.println(strOne.toUpperCase() + " : Length : " + strForLengthAndNewValue2.length());
			
			///////////////////////////////
			
		//C. If parameter 1 length is less than parameter 2	
		} else if ( strOne.length() < strTwo.length()) {
			
			// then print parameter2 all in
			//lowercase
			strTwo.toLowerCase();						//with its length
			System.out.println(strTwo + " : Length : " + strTwo.length());
		}
	}
}
/* 
Write a method that takes two String parameter and checks if the length of parameter
one equal to the length of parameter two.
a. If they are equal, then concatenate parameter 1 with parameter two and
print the new string value with its length
b. If parameter 1 length is greater than parameter 2 then print parameter 1 all
in uppercase with its length
c. If parameter 1 length is less than parameter 2 then print parameter2 all in
lowercase with its length

Access Modifier: public
Non-Access Modifier: static
Return Type: void
Method Name: isEqualLength
Parameter1: String strOne
Parameter2: String strTwo
 */
