import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class SelectionSort<E> {

	ArrayList<E> array;

	public SelectionSort() {

		array = new ArrayList<E>();

	}

	public  static <E extends Comparable<E>> ArrayList<E> sort(ArrayList<E> list) {

		Collections.sort(list);

		return list;
	}

	public  static <E> void print(java.util.List<E> listToPrint) {

		for (E element : listToPrint)
			System.out.print(" " + element);

	}

}
