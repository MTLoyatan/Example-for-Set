package CollectionAlgorithms;

import java.util.*;

public class ReversFillCopyMaxMin {

	private Character[] letters = { 'p', 'c', 'm' };
	private Character[] lettersCopy;
	private List<Character> list;
	private List<Character> copyList;

	public ReversFillCopyMaxMin() {
		// TODO Auto-generated constructor stub
		// if we have an array and willing to convert it in list we may use
		// Array.aslist(the array)
		// CollectioCopy syntax= CollectioCopy
		// syntax(destinationList,sourceList);
		list = Arrays.asList(letters);
		lettersCopy = new Character[3];
		copyList = Arrays.asList(lettersCopy);

		output(list);
		System.out.println();
		// System.out.println("now copy list ");
		// output(copyList);
		System.out.println();
		Collections.reverse(list);
		output(list);
		System.out.println(" ");
		Collections.sort(list);
		output(list);
		System.out.println();
		Collections.copy(copyList, list);
		output(copyList);
		System.out.println();
		Collections.fill(copyList, 'r');
		output(copyList);
		System.out.println();
		System.out.println("the maximum value is " + Collections.max(list));
		System.out.println("the minimum value is " + Collections.min(list));
		

	}

	public void output(List<Character> list) {

		for (Character node : list)
			System.out.print(" " + node);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReversFillCopyMaxMin();

	}

}
