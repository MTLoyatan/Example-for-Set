
public class Passarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [] array={1,2,3,4,5};
			System.out.println("Effects of passing reference to entier array\n"+
			" the valuse of original array are: ");
			for ( int value : array)
				System.out.printf("  %d",value);
			
			
			modifyarray(array);

			System.out.println("\n\nthe values of modified array are ");
			
			for( int value:array)
			
				System.out.printf("  %d",value);
			
			
			
			System.out.println();
			System.out.printf("Effects of passing  array element value\n "+
					 "array[3] before modifyElement: %d\n",array[3]);
				
			modifyelement(array[3]);
			System.out.printf( 
					"array[3] after modifyElement: %d\n", array[ 3 ] );
			
			
			
	}
		
	public static void modifyarray( int array2[])
	{
		for ( int counter = 0; counter < array2.length; counter++)
			array2[counter]*=2;
	
	}
	
	public static void modifyelement(int element )
	{
	element *=2;
	
	System.out.printf("Value of element in modifyElement: %d\n",element);
	}
	
}
