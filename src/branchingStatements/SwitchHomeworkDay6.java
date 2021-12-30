package branchingStatements;

public class SwitchHomeworkDay6 {
	public static void main (String [] args) {
	
			//Using Switch Statement:
		String colorOption = "Orange"; //To Start a Switch, a variable is a must have to clarify our rule/condition of choosing.
		//I created a String variable (container) named = colorOption and stored Orange value inside the String variable/container. 
		
		
		//Switch needs to know the name of our variable so it can start searching that name, then starts working for that variable name.
		switch (colorOption) // our variable name is colorOption.
		//once it finds the value of the variable in the branches, it works for that branch and command.
		
		{
		case "Red":
			System.out.println("Color = " + "Red");
			break;
		case "Orange":
		//The above^ value is stored in colorOption, switch was only looking for this value so it can start working for this value/branch
			System.out.println("Orange " + "Color");
			break;
		case "Black":
			System.out.println("Black" + "Color");
			break;
		default:
			System.out.println("Wrong Color, Not Available");
		}
	
	
	}

}
