package CollectionAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch2 {
		
	private static final String[] colors={"d","f","h","a","c","b","k"};
	private static LinkedList<String> list;
	
	
	public BinarySearch2() {
		
		list= new LinkedList<String>(Arrays.asList(colors));
		Collections.sort(list);
		System.out.printf(" %s",list);
		System.out.println();
		for(String c : colors)
			System.out.print(" "+c);
		System.out.println();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinarySearch2 test = new BinarySearch2();
        Scanner input = new Scanner(System.in);
        System.out.println(" enter key search");
        int result=test.search(list,input.next());
        if(result>=0)
        	System.out.println(" found in index"+result);
        else
        	System.out.println(" couldent find it");
	}

	
		public int search(List<String> list1 ,String key){
			
			Collections.sort(list1);
			int location=Collections.binarySearch(list1, key);
			if(location>0)
			
			return location;
			
				return -1;
							
					}
}
