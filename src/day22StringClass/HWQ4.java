package day22StringClass;

public class HWQ4 {
	//Main method is a must have for every program/HWquestion, to use other methods through it.
	
	public static void main(String[] args) {
		
		//String variable needed so data can be passed/retrieved/print through it
		String dataToBePassed = getSubStr(null, 2, 6);
		String dataToBePassed2 = getSubStr("java training", 2, 6);
		String dataToBePassed3 = getSubStr("Softwar Development Engineer in TEST", 11, 23);
		String dataToBePassed4 = getSubStr("Software Development Engineer in TEST", 21, 29);
		
		
		//String value passed to printer(Sysout) so we can print the results.
		System.out.println(dataToBePassed);
		System.out.println(dataToBePassed2);
		System.out.println(dataToBePassed3);
		System.out.println(dataToBePassed4);
	}
	
	
//Write a method to get a substring
						//of a given string between two specified positions.
	public static String getSubStr (String str, int startingIndex, int endingIndex) {
		String result = "";
		
//if we pass null as value, we will get error so...
//to avoid the null error in Console/output we have to use if-else statement/instructions.

		if (str == null) {//if (str is passed null as value) then{returnNullBack
			result = null;
		}
		//else(if not null as value then, do return substring...
		else {
			result = str.substring(startingIndex, endingIndex);
		}
		
		return result;
	}
}
/* 4. Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
Test Data:
getSubStr (null, 2 ,6) ----- null
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer*/