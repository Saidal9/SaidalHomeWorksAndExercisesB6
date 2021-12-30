package branchingStatements;

public class IfElseHomework {
	public static void main (String [] args) {
		
		//If-ElseIf branching statement : This branching statement, as the name states, is used to create multiple branches.
		
		String colorOption = "Gray";
		// To make a if else statement start running, it needs a variable to start looking for work(branch).
		// We created a variable called/typeOf (String) we named the variable (colorOption) and we stored "Gray" inside this container/variable/
		
		
		if (colorOption == "Gray")
		
		{
			System.out.println("Gray Color");
			//The if starts  if it finds facts stored inside, it first checks what type of work we have given it then it starts looking.
			//Note : this (if) will not start working for any branch if it doesn't find facts that is stored inside it. facts(True/False).
			
		} else if (colorOption == "Red")
		//(If) did not find "Gray" so it moved to next branch to find the value (gray).
		{
			System.out.println("Red Color");
			
			
		} else if (colorOption == "Orange") {
			System.out.println("Orange Color");
			
			// it did not find "gray" anywhere so it went to else. Else tells it what to do if it did not find it's target.
		} else System.out.println("Wrong Color, None of the Above");
		
	}
}
