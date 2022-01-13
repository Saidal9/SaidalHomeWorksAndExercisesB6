package day8LoopsHomeWork;

public class Hurricane {
	public static void main(String[] args) {
		/** 
		 * Write a program called Hurricane (class name) that takes the wind speed.
		 *  If it qualifies as a hurricane then display the wind speed and the Hurricane category it is.

Wind speed can be anywhere from 20 -200.
 Using java loop, loop through and print ONLY if it qualifies as a Hurricane,
		 */
		//we use loop so we don't repeat/rewrite our codes/action/requirement over and over again
		for (int windSpeed = 20; windSpeed<=200; windSpeed++)
	//we know the windSpeed starts from 20; therefore we initialize our windspeed variable to 20, and we know the windspeed ends at 200; therefore..
	//our stoppage number should be inside boolean expression (windSpeed<=200), 
			// the program will keep adding (incrementing/++) as long as the boolean expression is false or(becomes true).
		{
// our conditions(consists) are the following based on the requirements given to us
			if (windSpeed >=74 && windSpeed<=95) {
	//if windSpeed ^ becomes (increments) bigger than 74 and(&&) windspeed is less than(<) from 95 then sysout the following.
				System.out.println(" Hurricane, Category : 1:     " + windSpeed);
	
	
			} else if (windSpeed >=105 && windSpeed<=110)
			//if windSpeed ^ becomes (increments) bigger than 105 and(&&)(another rule) windspeed is less than(<) from 110 then print the following.
			{
				System.out.println("Hurricane, Category : 2:     " + windSpeed);
				
		
			} else if ( windSpeed >= 120 && windSpeed <=130)
			//if windSpeed ^ becomes (increments) bigger than 120 and(&&)(another rule) windspeed is less than(<) from 130 then print the following.
			{
				System.out.println("Hurricane, Category: 3:		 " + windSpeed);
				
			} else if (windSpeed>= 140 && windSpeed <=155 ) 
		//if windSpeed ^ becomes (increments) bigger than 140 and(&&) windspeed is less than(<) from 155 then print the following.
			{
				System.out.println(" Hurricane, Category: 4:	 " + windSpeed);
				

			} else if (windSpeed >= 165 && windSpeed <=194 )
			
			//if windSpeed ^ becomes (increments) bigger than 165 and(&&)(another rule to be checked) windspeed is less than(<) from194 then sysout the following.
			{
				System.out.println("Hurricane, Category : 5 : 		" + windSpeed);
			}
		}
	}
}
/*
 
1 Category
74-95 Wind Speed 
2 Category
105 – 110  Wind Speed
3 Category
120-130			Wind Speed
4 Category
140-155			Wind Speed
5 Category
165-194			Wind Speed
*/