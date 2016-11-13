import java.util.*;

public class LinkedList$Iterator {

	private static final String[] colors1 = { "black", "yellow",

	"green", "blue", "violet", "silver" };
	private static final String[] colors2 = { "gold", "white",

	"brown", "blue", "gray", "silver" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String color : colors1)
			list1.add(color);
		for (String i : list1)
			System.out.print(" " + i);
		System.out.println("\n");
		for (String color : colors2)
			list2.add(color);
		for (String i : list2)
			System.out.print(" " + i);
		System.out.println("\n");

		list1.addAll(list2);
		list2 = null;

		for (String color1 : list1)
			System.out.print(" " + color1);
		System.out.println("\n");

		convertToUpperCase(list1);
		for (String color2 : list1)
			System.out.print(" " + color2);
		System.out.println("\n");

		System.out.println("this is remove list:");
		removeList(list1, 4, 7);

		for (String color : list1)
			System.out.println("\n");

		reversList(list1);
		for (String color : list1)
			System.out.print(" " + color);
		System.out.println("\n");
		System.out.println(" r2");
		remove2(list1, list2);

		for (String color : list1)
			System.out.print(" " + color);
		System.out.println("\n");

	}

	private static void convertToUpperCase(List<String> list) {

		ListIterator<String> itarator = list.listIterator();
		while (itarator.hasNext()) {

			String color = itarator.next();
			itarator.set(color.toUpperCase());

		}
	}

	private static void removeList(List<String> list, int start, int end) {

		System.out.println(((ArrayList<String>) list).subList(start, end));
		(list).subList(start, end).clear();
	}

	private static void reversList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());

		while (iterator.hasPrevious())
			System.out.print(" " + iterator.previous());
	}

	private static void remove2(List<String> list1, List<String> list2) {
		Iterator<String> itrator = list1.iterator();

		while (itrator.hasNext())

			if (list2.contains(itrator.next()))
				itrator.remove();

	}
}
