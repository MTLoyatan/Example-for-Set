public class CollectionsOverviewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionsOverview usingArrays = new CollectionsOverview();
		
		usingArrays.printArrays();

		usingArrays.printEquality();

		int location = usingArrays.searchForInt(5);

		if (location >= 0)

			System.out.printf(

			"Found 5 at element %d in intArray\n", location);

		else

			System.out.println("5 not found in intArray");

		location = usingArrays.searchForInt( 8763);

		if (location >= 0)

			System.out.printf("Found 8763 at element %d in intArray\n",
					location);

		else

			System.out.println("8763 not found in intArray");

	}

}
