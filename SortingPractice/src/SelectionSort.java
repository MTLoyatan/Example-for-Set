import java.util.Random;

public class SelectionSort {

	private int data[];
	private static Random generatoer = new Random();

	public SelectionSort(int size) {
		data = new int[size];
		for (int i = 0; i < size; i++)

			data[i] = 10 + generatoer.nextInt(90);
		for(int j=0;j<data.length;j++)
			System.out.printf(" %d",data[j]);
		System.out.println();

	}

	public void sort() {

		int smallest;

		for (int i = 0; i < data.length - 1; i++) {
			smallest = i;
			for (int index = i + 1; index < data.length; index++)
				if (data[index] < data[smallest])
					smallest = index;
			swap(i, smallest); // swap smallest element into position
			printPass(i + 1, smallest);
		}
	}

	public void swap(int first, int second) {

		int temporary = data[first];
		data[first] = data[second];
		data[second] = temporary;
	}

	public void printPass(int pass, int index) {

		System.out.print(String.format("after pass %2d: ", pass));

		for (int i = 0; i < index; i++)

			System.out.print(data[i] + "	");

		System.out.print(data[index] + "* "); // indicate swap

		// finish outputting array

		for (int i = index + 1; i < data.length; i++)

			System.out.print(data[i] + "	");

		System.out.print("\n	"); // for alignment

		// indicate amount of array that is sorted

		for (int j = 0; j < pass; j++)

			System.out.print("--	");

		System.out.println("\n"); // add endline

	} // end method indicateSelection

	// method to output values in array

	public String toString()

	{

		StringBuilder temporary = new StringBuilder();

		// iterate through array

		for (int element : data)

			temporary.append(element + "	");

		temporary.append("\n"); // add endline character

		return temporary.toString();

	}
}
