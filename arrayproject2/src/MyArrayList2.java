import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList2 {

	ArrayList<Integer> myList;
	int iterator;
	Scanner input;

	public MyArrayList2() {

		myList = new ArrayList<>();
		iterator = 0;
		input = new Scanner(System.in);

	}

	public boolean insert(int param) {

		boolean ok = false;

		myList.add(param);
		iterator++;
		ok = true;

		return ok;
	}

	public int search(int key) {
					
		return myList.indexOf(key);
	}
			
	public boolean delete(int key){
		
		boolean ok=false;
		int index=search(key);
		
		if(index>=0){
			
			myList.remove(index);
			iterator--;
			ok=true;
			return ok;
		}
		return ok;
		
	}
	
	public void displayItems(){
		for(int i=0; i<iterator;i++)
			System.out.print(" "+myList.get(i));
		System.out.println();
		
	}
	
}
