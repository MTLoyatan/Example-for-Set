import java.util.Scanner;

public class stacktest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		stackprac theStack = new stackprac(5);

		do {

			int val = input.nextInt();
			theStack.push(val);
		}

		while (!theStack.isFull());

		System.out.println("stack is full");

		while (!theStack.isEmpty()) {
			int value = theStack.pop();
			System.out.println(value);
		}
		System.out.println("stack is empty");

	}

}
