import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SelectionSortTest {

	public static void main(String[] args) {

		Pair<String, Integer> myPair = new Pair<String, Integer>();
		myPair.setFirst("apple");
		myPair.setSecond(10);
		// System.out.println(myPair.toString());
		String[] sa = {"mehdi","mahmood","elaheh","jasem" };
		LinkedList<String> mylist2 = new LinkedList<String>(Arrays.asList(sa));

		prinMe(mylist2);
		System.out.println();
		sort(mylist2);
		prinMe(mylist2);
		// String[] sa = { "as", "rewr", "qwe", "yyyu" };
		// Integer[] ia = { 5, 8, 1, 7, 11, 21 };
		//
		// sort(sa);
		// sort(ia);
		//
		// printMe(sa);
		// printMe(ia);
		// System.out.println();
		// try {
		//
		// printMe(sa, -1, 2);
		// } catch (InvalidSubscriptException e) {
		// System.out.println(e);
		// }
		// try {
		//
		// printMe(sa, 3, 6);
		// } catch (InvalidSubscriptException e) {
		// System.out.println(e);
		// }
		// try {
		//
		// printMe(sa, 2, 1);
		//
		// } catch (InvalidSubscriptException e) {
		// System.out.println(e);
		// }
		// try {
		//
		// int count;
		// count = printMe(sa, 1, 2);
		// System.out.println(count);
		// count = printMe(ia,2,5);
		// System.out.println(count);
		//
		// } catch (InvalidSubscriptException e) {
		// System.out.println(e);
		// }
	}

	public static <E extends Comparable<E>> void sort(E[] arr) {

		int smallest;
		for (int i = 0; i < arr.length - 1; i++) {

			smallest = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[smallest].compareTo(arr[j]) > 0)
					smallest = j;
			}

			E temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}

	}

	public static <E extends Comparable<E>> void sort(List<E> list) {

		int smallest;

		for (int i = 0; i < list.size() - 1; i++) {

			smallest = i;

			for (int j = i + 1; j < list.size(); j++)
				if (list.get(smallest).compareTo(list.get(j)) > 0)
					smallest = j;

			E temp=list.get(smallest);
			list.set(smallest, list.get(i));
			list.set(i,temp);
		
		
		}
	}

	public static <E> void prinMe(List<E> mylist) {

		for (E element : mylist)
			System.out.printf("%s ", element);

	}

	public static <T> void printMe(T[] arr) {
		for (T element : arr)
			System.out.printf("%s ", element);
		System.out.println();
	}

	public static <T> int printMe(T[] arr, int lowSub, int highSub) {
		if ((lowSub < 0 || highSub > arr.length) || lowSub > highSub)
			throw new InvalidSubscriptException();
		for (int index = lowSub; index <= highSub; index++)
			System.out.printf("%s ", arr[index]);
		System.out.println();
		return highSub - lowSub + 1;
	}
}