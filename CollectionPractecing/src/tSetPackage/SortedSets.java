package tSetPackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {

	private static final String names[] = { "yellow", "green",

	"black", "tan", "grey", "white", "orange", "red", "green" };
	
	private static final Integer numbers[]={1,2,3,4};
	SortedSets() {
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));
		
		
		printSet(tree);
		System.out.println();
		System.out.printf("  %s ",tree.headSet("orang"));
		System.out.println();
		System.out.print(" :"+tree.tailSet("orang"));
		System.out.println();
		System.out.printf("%s ",tree.first());
		System.out.println();
		System.out.printf(" %s",tree.last());
		
		
	}

	private void printSet(SortedSet<String> set)

	{

		for (String s : set)

			System.out.printf("%s ", s);

		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new SortedSets();
	}

}
