package CollectionAlgorithms;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearch {

	private static final String colors[] = { "red", "white",

	"blue", "black", "yellow", "purple", "tan", "pink" };

	private LinkedList<String> list; // ArrayList reference

	public BinarySearch()

	{

		list = new LinkedList<String>(Arrays.asList(colors));
		Collections.sort(list);
		System.out.printf("Sorted ArrayList: %s\n", list);

	} // end BinarySearchTest const

	private int search(String key)

	{

		int result = 0;

		result = Collections.binarySearch(list, key);

		if (result >= 0)

			return result;

		return -1;

	} // end method printSearchResults

	public static void main(String args[])

	{

		BinarySearch binarySearchTest = new BinarySearch();

		Scanner input = new Scanner(System.in);
		System.out.println("enter the key search ");
		String key = input.next();
		int result=binarySearchTest.search(key);
		if(result>=0)
			System.out.println(" found at "+result);
		else 
			System.out.println(" fouck that I couldn't find it");
	} // end main

} // end class BinarySearchTest
