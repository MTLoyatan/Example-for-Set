import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Main {

	/**
	 * @param args
	 */
	
	private static final  String[] alphabets ={"D","C","B","A","E","F","G","H","H","D"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> list = new TreeSet<String>(Arrays.asList(alphabets));
		
		System.out.printf("%s\n",list);
		
		SortedSet<String> ss = new TreeSet<String>(Arrays.asList(alphabets)); 
		for(String str : ss.headSet("E"))
				System.out.print(" "+str);
		System.out.println();
		
		System.out.println("first: "+ss.first());
		System.out.println();
		System.out.print("last "+ss.last());
		
	}

}
