package zExercises;

import java.util.*;

/*
 Write a program that inserts 25 random integers from 0 to 100 in order into a linked-list
 object. The program should calculate the sum of the elements and the floating-point average of the
 elements.*/
public class Q19_17 {

	Random rnd;
	int[] randomarr;
	List<Integer> randomlist;
	SortedSet<Integer> setList; 
	public Q19_17() {
		
		rnd= new Random();
		randomarr= new int[25];
		randomlist = new LinkedList<Integer>();
		//setList= new TreeSet<Integer>();
		
		

	}
	
	
	public void action(){
		
		
		for(int i=0;i<randomarr.length;i++)
			randomarr[i]=rnd.nextInt(100);
		
		for(int j=0;j<randomarr.length;j++)
			System.out.print(" "+randomarr[j]);
		System.out.println("\n\n");
		
		for(int h=0;h<randomarr.length;h++)
			randomlist.add(randomarr[h]);
			
		
	System.out.printf("%s ",randomlist);
	System.out.println();
		//setList.addAll(randomlist);
		//System.out.printf("%s",setList);
	
		
	}
	
		
	public void sumFloating( int point){
		 int total=0;
		
		for(int i=0;i<randomlist.indexOf(point);i++)
			
			total+=randomlist.get(i);
			
		
		System.out.print("sum is : "+total);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Q19_17 object = new Q19_17();
		object.action();
		
		System.out.println();
		System.out.println("choos your number: ");
		int number=input.nextInt();
		object.sumFloating(number);
	}

}
