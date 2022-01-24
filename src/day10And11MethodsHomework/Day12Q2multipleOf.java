package day10And11MethodsHomework;

public class Day12Q2multipleOf {
	public static void main(String[] args) {
//for cleanliness of this page, i'm typing the details of this exercise (of what i must do to complete this exercise), in the bottom of this class(page). 
		
		
		Day12Q2multipleOf objectForAccessingTheDefaultMethod = new Day12Q2multipleOf();
		
		boolean numberToBeTested = objectForAccessingTheDefaultMethod.multipleOf(24);
		
		System.out.println(numberToBeTested);
		
		System.out.println("***********************");
		
		boolean anotherNumberToBeTested = objectForAccessingTheDefaultMethod.multipleOf(3);
		System.out.println(anotherNumberToBeTested);
		
		System.out.println("****************************");
		
		boolean anotherNumberToBeTestedFormThree = objectForAccessingTheDefaultMethod.multipleOf(10);
		System.out.println(anotherNumberToBeTestedFormThree);
		
		System.out.println("******************************");
		
		boolean lastNumberForTesting = objectForAccessingTheDefaultMethod.multipleOf(8);
		System.out.println(lastNumberForTesting);
	}

	boolean multipleOf(int nonNegativeNumber) {
		
		boolean result = false;
		
		if ( nonNegativeNumber % 3 == 0 || nonNegativeNumber % 5 == 0) {
			result = true;
		}

		return result;
	}

}
/*
 *  Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
 *
	"mod" operator
	multipleOf (3) --- true
	multipleOf (10) ---  true
	multipleOf (8) ---  false
*******************************DETAILS IN THE BOTTOM :...
*
* I can start typing this method because i already know this question/exercise belongs to methods folder homework, if it was not, i may struggled to do this exercise
* but now that we know that most operations/work/exercise/ performing a specific type of work/question is done through methods, we can get help with the concept of methods
So let us start: We know that methods are used to do certain operations/work for us for a particular type of work/exercise/question/instruction/homework. 
By looking at the exercise provided/given to us i can barely see that it is asking us to do a specific/known type of work, so we know from our topics that:
* Methods are used to do specific type of operation/work/perform a work or (question) in this particular given exercise, for us.
So we start writing typing our method if the elements are given to us. So far i can see most elements are not given to us like our first element to create a method is
* Access modifiers but remember if we do not a have a access modifier for our method/variables, it means java automatically gives us (method/variable) a modifier which...
* is default modifier. Default modifiers should not be written/typed because when we do not type the modifiers for parts it means the modifier for them is default.
Looking at the question i know that it is asking for (Return true).I can imagine : Oh it says return true, so i need or already got the first element or the first typing
start point to type a method so to return true or false we know to use boolean return type>remember. First element access type 2nd return type so it gave us typing start
* going on with reading and typing at the same time,... it gave us parameter for the method too which is saying (given non-negative number...) number means lets use int
* or any variable type that can contain/store number in it so ... using int we can implement this part of exercise in the typing too. when given parameter then add the
* variables in method parameters or parenthesis too so (int number).. i named mine nonNegativeNumber to understand the question better. And describe the number better.
* 
* So far the method is been created and only needs the organs (logic/or required performance of exercise), we must implement this requirements of this question inside 
* method body.Method body is started/typed with curly braces {. We must go back and forth, reading wise to understand, and also implementing wise to acquire the...
* the answer for this homework question/exercise. So moving forward,,> The question/homework says return true ..so lets create a variable to do the returning process 
* if we do not provide this returning variable inside method then the error will point it out that we need a variable to return the value of this type of method
* then we use the "return" java keyword to finish the returning the process of our method. Getting to the main requirements .> it says if the number is multiple of 3 or 5
* how do we know the multiples of a specific given number (3,5) ? Answer: by using the modulo sign "%" , so given parameter % 3. do not forget to add == 0 afterwards 
* then we use the help of branching (if - else) instructions/statements to do the printing and so on.
* 
* side notes:
* we said as modifier is not given we use default modifier which means..do not type any access modifier if it is not given and it will have default modifier automatically.
* to access default access types methods (multipleOf) we must create class object then we can access it from main method.
* it is recommended to create variable for accessing/using and passing values from that variable.. example : boolean result = object.method(0,0);
* 
*/