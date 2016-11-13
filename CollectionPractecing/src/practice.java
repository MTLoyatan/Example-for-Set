import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class practice {

	private static java.util.List<String> list;
	Scanner input;
	boolean exit;

	public practice() {

		list = new LinkedList<String>();
		input = new Scanner(System.in);
		exit = false;

	}

	public java.util.List<String> creatingList() {

		System.out.println("enter first names:");
		do {
			String name = input.next();
//			int chechk=search(list, name);
//			if (chechk > 0)
//				System.out.println("try another name ");
//
//			else
				list.add(name);

			System.out.println("any names? ");
			String result = input.next();
			if (result.toLowerCase().equals("y")
					|| result.toLowerCase().equals("yes"))
				continue;
			else
				exit = true;

		} while (!exit);

		return list;
	}

	public void printList(java.util.List<String> Mylist) {

		for (String element : Mylist)
			System.out.print(" " + element);
	}

	public int search(java.util.List<String> currentlist, String key) {

		Collections.sort(currentlist);

		int location = Collections.binarySearch(currentlist, key);

		if (location > 0)
			return location;
		else
			return -1;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		practice practic = new practice();
		practic.creatingList();
		practic.printList(practic.creatingList());
		System.out.println("enter a key to search: ");
		int result = practic.search(list, input.next());
		if (result > 0)
			System.out.println("key found at:  " + result);
		else
			System.out.println("couldn't find it!!! ");

	}
}
