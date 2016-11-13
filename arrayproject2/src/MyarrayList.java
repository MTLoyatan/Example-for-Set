import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyarrayList {

	private int iterator;
	private ArrayList arr;
	private Scanner input;

	public MyarrayList() {

		iterator = 0;
		arr = new ArrayList();
		input = new Scanner(System.in);

	}

	public boolean insert(int value) {
		arr.add(value);
		iterator++;
		return true;

	}

	public int search(int searchkey) {
		return arr.indexOf(searchkey);

	}

	public boolean delete(int deletekey) {
		int index=search(deletekey);
		if(index>=0)
			arr.remove(index);
		iterator--;
		return true;
	}
	public void displayItems(){
		for(int i=0; i<iterator;i++)
			System.out.print(" "+arr.get(i));
		System.out.println();
		
	}
			
	

}
