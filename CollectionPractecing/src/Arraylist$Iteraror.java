import java.util.*;

public class Arraylist$Iteraror {

	/**
	 * @param args
	 */
	private static final String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE",
			"CYAN" };
	private static final String[] removecolors = { "RED", "WHITE", "BLUE" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(Arrays.asList(colors));
		List<String> removelist = new ArrayList<String>(
				Arrays.asList(removecolors));

		System.out.println(" colors are as follow");
		System.out.print("list= ");
		for (String i : list)
			System.out.print(" " + i);
		System.out.println();
		System.out.print("remove list= ");
		for (String r : removelist)
			System.out.print(" " + r);

		System.out.printf(" \n\n\n\n");

		removeColors(list, removelist);

		System.out.println(" new collections are as follows\n\n");
		System.out.print("list=");
		for (int i = 0; i < list.size(); i++)
			System.out.print(" " + list.get(i));
		System.out.println();
		System.out.print("remove= ");
		for (int h = 0; h < removelist.size(); h++)
			System.out.print(" " + removelist.get(h));
	}

	private static void removeColors(Collection<String> collection1,
			Collection<String> collection2) {

		Iterator<String> iterator = collection1.iterator();
		while (iterator.hasNext())
			if (collection2.contains(iterator.next()))
				iterator.remove();

	}
}
