import java.util.Arrays;
import java.util.Collections;

public class CollectionsOverview {
	/*
	 * A collection is a data structure—actually, an object—that can hold
	 * references to other objects . Usually, collections contain
	 * references to objects that are all of the same type
	 */

	/*
	 * Interface         Description
	 * 
	 * Collection -------->The root interface in the collections hierarchy from
	 * which interfaces Set,Queue and List are derived.
	 * 
	 * 
	 * Set -------->A collection that does not contain duplicates.
	 * 
	 * List-------->An ordered collection that can contain duplicate elements.
	 * 
	 * Map--------> Associates keys to values and cannot contain duplicate keys.
	 * 
	 * Queue-------->Typically a first-in, first-out collection that models a
	 * waiting line; other orders can be specified.
	 */

	/*
	 * Class Array Class Array Class Array Class Array
	 */
	//array.fill(torgetarray[], desierd argument)
	// this method filles "torgetarray" with "desierd argument"
	
	//arrays.sort(array[])
	//this method sorts array[] in ascending orther
	
	//system.arraycopy(source,fromindex,target,fromindex,desierdLenght)
	//this method copeis from index of source array into index of target array 
	
	private int[] intArray = { 1, 2, 3, 4, 5, 6 };
	private double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
	private int filledIntArray[], intArrayCopy[];

	public CollectionsOverview() {
		filledIntArray = new int[intArray.length];
		intArrayCopy = new int[intArray.length];

		Arrays.fill(filledIntArray, 7);
		Arrays.sort(doubleArray);
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		

	}
	public void printArrays()

	{
	
	System.out.print( "doubleArray: " );
		for ( double doubleValue : doubleArray )
		System.out.printf( "%.1f ", doubleValue );
	
	System.out.print( "\nintArray: " );
	
	for ( int intValue : intArray )
	
	System.out.printf( "%d ", intValue );
	
	
	System.out.print( "\nfilledIntArray: " );
	
	for ( int intValue : filledIntArray )
	
	System.out.printf( "%d ", intValue );
	
	
	System.out.print( "\nintArrayCopy: " );
	
	for ( int intValue : intArrayCopy )
	
	System.out.printf( "%d ", intValue );
	
	
	System.out.println( "\n" );
	
	} 
	
	  
	
	public int searchForInt( int value ){
		
	return Arrays.binarySearch(intArray,value);	
	}
		
	public void printEquality(){
		boolean b= Arrays.equals(intArray, intArrayCopy);
		System.out.printf( "intArray %s intArrayCopy\n",
				( b ? "==" : "!=" ) );
	
	
	 boolean d = Arrays.equals( intArray , filledIntArray );
	 System.out.printf("intArray %s filledIntArray\n",
				( d ? "==" : "!=" ) );
	}
		
	
	
	}
	
	


