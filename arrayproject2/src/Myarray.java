import java.util.Scanner;

public class Myarray {

	private int[] arr;
	private int nItems;
	private Scanner input;

	public Myarray() {

		arr = new int[20];
		nItems = 0;
		input = new Scanner(System.in);

	}

	public void insert(int value) {
		arr[nItems++] = value;
	}

	public int serach(int searchkey) {
		for (int i = 0; i < nItems; i++)
			if (arr[i] == searchkey)
				return i;

		return -1;
	}

	public boolean delete(int deletekey) {
		int index = serach(deletekey);
		if (serach(deletekey) >= 0) {

			for (int i = index; i < nItems; i++)
				arr[i] = arr[i + 1];
			nItems--;
			return true;
		} else
			return false;
	}

	public void display() {

		for (int i = 0; i < nItems; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
