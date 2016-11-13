import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Linkedlist$Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String []colors={"black","blue","yellow"};
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
				
		links.addLast("red");
		links.add("pink");
		links.add(3,"green");
		links.addFirst("cyan");
		for( String color : links)
			System.out.printf(" "+ color);
		System.out.println("\n");
		
		colors = links.toArray( new String[links.size()]);
		
		for( String color : colors)
			System.out.printf(" "+ color);
		
		 
		 
		
		
		
	}

}
