package CollectionAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortAscendingandDescending {
	 private static final String suits[] =
			
		{ "1", "3", "2", "4" };
	
	 public void printArrays(){
		 
		 List<String> list = Arrays.asList(suits);
		
		 System.out.printf("%S",list);
		 System.out.println();
		for( String element : list)
			 System.out.print(" "+ element);
		 System.out.println();
		Collections.sort(list);
		System.out.printf("%S",list);
		 System.out.println();
		 Collections.sort(list, Collections.reverseOrder());
		System.out.println(" sorting in revers order");
		 System.out.printf("%S",list);
		
		
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		SortAscendingandDescending object = new SortAscendingandDescending();
		object.printArrays();
	}

}
