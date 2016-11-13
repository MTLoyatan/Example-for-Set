package zExercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.print.DocFlavor.INPUT_STREAM;

/*Write a program that determines and prints the number of duplicate words in a sentence.
 Treat uppercase and lowercase letters the same. Ignore punctuation*/
public class Q19_16 {
	Scanner input;
	Map<String, Integer> map;

	public Q19_16() {

		map = new HashMap<String, Integer>();
		input = new Scanner(System.in);

		creatmap();
		displayduplicatedkeys(map);
	}

	public void creatmap() {

		System.out.print("print String ");

		String stringinput = input.nextLine();
		StringTokenizer tokenaizer = new StringTokenizer(stringinput);

		while (tokenaizer.hasMoreTokens()) {
			String word = tokenaizer.nextToken().toLowerCase();

			if (map.containsKey(word)) {
				int cout = map.get(word);
				map.put(word, cout + 1);

			}

			else
				map.put(word, 1);

		}

	}

	public void displayduplicatedkeys(Map<String, Integer> mymap) {
		
		
		Set<String> keys= mymap.keySet();
		TreeSet<String> sss=  new TreeSet<String>(keys);
		for(  String key : sss)
			
			if(mymap.get(key)>=2)
				System.out.printf("%s  ",key);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q19_16();
	}

}
