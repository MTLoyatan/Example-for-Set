package StackClassOfpakageJava;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	public StackTest() {

		Stack<Number> stack = new Stack<Number>();
		Long longNumber = 12L;
		Integer intNumber = 34567;
		Float floatNumber = 1.0F;
		Double doubleNumber = 1234.5678;
System.out.println(" Stack contains:\n");
		
		for(Number num : stack)
			System.out.print(" "+num);
		stack.push(longNumber);
		System.out.println("\n\n");
		printstack(stack);
		stack.push(intNumber);
		printstack(stack);
		stack.push(floatNumber);
		printstack(stack);
		stack.push(doubleNumber);
		printstack(stack);
		
		
		try

		{

			Number removedObject = null;

			while (true)

			{
				removedObject = stack.pop();
				System.out.printf("%s popped\n", removedObject);

				printstack(stack);

			}

		}

		catch (EmptyStackException emptyStackException)

		{

			System.out.println( emptyStackException.getMessage());

		} //

	}

	private void printstack(Stack<Number> stack) {
		if (stack.isEmpty())

			System.out.print("stack is empty\n\n"); // the stack is empty

		else
		// stack is not empty
		{

			System.out.print("stack contains: ");

			// iterate through the elements

			for (Number number : stack)

				System.out.printf("%s ", number);

			System.out.print("(top) \n\n"); // indicates top of the stack

		} // end else

	} // end method printSta

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new StackTest();
	}

}
