import java.util.Scanner;
public class Keypad {
	
	private Scanner input; // reads data fro
	// no-argument constructor initializes t
	public Keypad()
	{
	input = new Scanner( System.in );    
	} // end no-argument Keypad constructor
	// return an integer value entered by us
	public int getInput()
	{
	return input.nextInt(); // we assume 
	} // end method getInput
	} // end class Keypad


