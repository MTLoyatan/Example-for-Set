
package CollectionAlgorithms;

import java.awt.List;
import java.util.*;
import java.*;

public class AddallFriqequencyDisjoint {

	private String[] colors = { "red", "white", "yellow", "blue" };
	private java.util.List<String> list;
	private Vector<String> vector = new Vector<String>();

	public AddallFriqequencyDisjoint() {

		list = Arrays.asList(colors);

		vector.add("black");
		vector.add("red");
		vector.add("green");
		System.out.println( "Before addAll, vector contains: " );
		
		System.out.printf("%s ",vector);
		System.out.println();
		Collections.addAll(vector, colors);
		
		Collections.fill(list, "r");
		System.out.println( "after addAll, vector contains: " );
		System.out.printf("%s ",vector);
		System.out.println();
		int numbers=Collections.frequency(vector, "red");
		System.out.println("numbers: "+numbers);
		boolean disjoint=Collections.disjoint(vector, list);
		if(disjoint)
			System.out.println(" there is no similarity");
		else
			System.out.println("there are some similiar items");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AddallFriqequencyDisjoint();
	}

}
