import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionTest2 {

	// private String[] countries = { "iran", "iraq", "use", "canada", "uae",
	// "north korea" };
	// private String[] sanctions = { "iran", "iraq", "north korea" };

	public CollectionTest2() {

		super();

		List<String> countreislist = new ArrayList<String>();
		List<String> sanctionlist = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		boolean exit = false;

		System.out.println("enter countreis(done to exit) ");
		do {
			String country = input.next();
			if (country.equals("done"))

				exit = true;
			else
				countreislist.add(country);

		} while (!exit);

		System.out.println("enter sanctions ");

		exit = false;// reset exit for next loop

		do {
			String sanction = input.next();
			if (sanction.equals("done"))

				exit = true;
			else
				sanctionlist.add(sanction);

		} while (!exit);

		System.out.println(" the countreis list is as follows:");
		outputList(countreislist);
		System.out.println("\n");

		System.out.println(" the sanction list is as follows:");
		outputList(sanctionlist);
		System.out.println("\n");

		countreislist.addAll(sanctionlist);
		System.out
				.println(" the list after adding all countries is as follows:");
		outputList(countreislist);
		System.out.println("\n");
		convertTOupperCase(countreislist);
		System.out.println("the list after convert   is as follows:");
		System.out.println("\n");
		outputList(countreislist);
		System.out.println("\n");
		System.out.println("the list after revers   is as follows:");
		reversingList(countreislist);

		System.out.println("\n");

	}

	public void reversingList(List<String> countreis1) {

		ListIterator<String> iterator = countreis1.listIterator(countreis1
				.size());

		while (iterator.hasPrevious())

			System.out.print(" " + iterator.previous());

		System.out.println();

	}

	public void convertTOupperCase(List<String> target) {

		ListIterator<String> iterator = target.listIterator();

		while (iterator.hasNext())

			iterator.set(iterator.next().toUpperCase());

	}

	public void removefromlist(List<String> first, List<String> second) {
		ListIterator<String> iterator = first.listIterator();

		while (iterator.hasNext())

			if (second.contains(iterator.next()))
				iterator.remove();

	}

	public void outputList(List<String> collection1) {

		for (String node : collection1)

			System.out.print(" " + node);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CollectionTest2();
	}

}
