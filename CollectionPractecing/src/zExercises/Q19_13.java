package zExercises;
import java.awt.List;
import java.util.*;

public class Q19_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> firstnames1 = new LinkedList<String>();

		Scanner input = new Scanner(System.in);
		boolean exit = false;

		do {

			System.out.println(" insert a name");
			String name = input.next();
			
			firstnames1.add(name);
			
			System.out.println(" any first names?");
			String result = input.next();
			if (result.toLowerCase().equals("yes")
					|| result.toLowerCase().equals("y"))
				continue;
			else
				exit = true;

		} while (!exit);
		
		int size=firstnames1.size();
		System.out.print("the size is:"+size);
		
		/**********REMOVE THE DUPLICATE***********/
		int counter=firstnames1.size()-1;
		while(counter!=0){
			
			if(firstnames1.get(counter).equals(firstnames1.get(counter-1)))
				firstnames1.remove(firstnames1.get(counter));
			counter--;
			
		}
			
		

		Collections.sort(firstnames1);
		System.out.printf("list==>%s", firstnames1);
		System.out.println();
		System.out.print("now enter a value to search");
		String searchkey = input.next();

		int result = Collections.binarySearch(firstnames1, searchkey);
		System.out.print("key found in index number " + result);

	}
	
}
