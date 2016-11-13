import java.util.Scanner;


public class Sortingtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int[] arr={10,11,12,13,19,2,4,5,3,1};
		SortArray object = new SortArray();
	
					
		object.sort(arr);
			System.out.println( "sorted array is ");
			object.toString(arr);
	}

}
