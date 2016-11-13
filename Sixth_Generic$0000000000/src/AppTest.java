import java.util.ArrayList;

public class AppTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * // befor java 5 ArrayList list = new ArrayList();
		 * 
		 * list.add("Iran"); list.add("Brazil"); list.add(6);
		 * 
		 * String country = (String) list.get(0); System.out.println(country);
		 * System.out.println();
		 * 
		 * //after java 5 ArrayList<String> list2 = new ArrayList<String>();
		 * list2.add("Iran"); list2.add("France"); list2.add("Brazil");
		 * list2.add("England");
		 * 
		 * String cnt = list2.get(3); System.out.println(cnt);
		 */
		Employee[] eArray = { new Employee(100, "ali", 150.8),
				new Employee(110, "reza", 180.3) };
		Integer[] iArray = { 2, 8, 5, 9, 6 };
		String[] sArray = { "banana", "apple", "orange" };
		Character[] cArray = { 'r', 'h', 'p', 'y' };

		/*
		 * printMe(iArray); printMe(sArray); printMe(cArray);
		 * 
		 * System.out.println(); // /////////////////////////////////////////
		 * System.out.printf("Max of three integers is %d\n", max(4, 8, 3));
		 * System.out.printf("Max of three integers is %.1f\n", max(2.4, 8.5,
		 * 10.3)); System.out.printf("Max of three strings is %s\n",
		 * max("apple", "orange", "banana"));
		 * 
		 * System.out.printf("Max of integers array is %d\n", max(iArray));
		 * System.out.printf("Max of characters array is %c\n", max(cArray));
		 * System.out.printf("Max of strings array is %s\n", max(sArray));
		 */

		Stack<Integer> iStack = new Stack<Integer>(5);
		Stack<String> sStack = new Stack<String>(3);
		Stack<Character> cStack = new Stack<Character>(4);
		Stack<Employee> eStack = new Stack<Employee>(2);
		/*
		 * iStack.push(70); iStack.push(80); iStack.push(10); iStack.push(100);
		 * 
		 * try { int popValue; while (true) { popValue = iStack.pop();
		 * System.out.printf("%s ", popValue); } } catch (EmptyStackException
		 * exc) { System.out.println(); System.out.println(exc); //
		 * exc.printStackTrace(); }
		 */

		pushToStack(iStack, iArray);
		pushToStack(sStack, sArray);
		pushToStack(cStack, cArray);
		pushToStack(eStack, eArray);
		popFromStack(iStack);
		popFromStack(sStack);
		popFromStack(cStack);
		popFromStack(eStack);

	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

	public static <T extends Comparable<T>> T max(T[] currentArray) {
		T max = currentArray[0];
		for (T element : currentArray)
			if (element.compareTo(max) > 0)
				max = element;

		return max;
	}

	/*
	 * public static void printMe(int[] inputArray){ for(int element :
	 * inputArray) System.out.printf("%s ",element); System.out.println(); }
	 * 
	 * public static void printMe(String[] inputArray){ for(String element :
	 * inputArray) System.out.printf("%s ",element); System.out.println(); }
	 */

	public static <T> void printMe(T[] inputArray) {
		for (T element : inputArray)
			System.out.printf("%s ", element);
		System.out.println();
	}

	public static <E> void pushToStack(Stack<E> myStack, E[] array) {

		for (E element : array)
			myStack.push(element);

	}

	public static <E> void popFromStack(Stack<E> myStack) {

		try {

			while (true) {
				E popvalue = myStack.pop();

				System.out.printf("%s ", popvalue);

			}
		} catch (EmptyStackException e) {

			System.out.println(e);
		}

	}

	
}
