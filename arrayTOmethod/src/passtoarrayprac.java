import java.sql.Array;


public class passtoarrayprac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,3,4,5};
		System.out.printf(" effects of passing reference to entier array\n "+
		"the value of original arrays are:\n");
		for(int value:array)
			System.out.printf(" %d ", value);
		
			modifyarray(array);
			System.out.println(" the values of modified array are:\n");
			
			for(int value : array)
				System.out.printf(" %d ",value);
			System.out.println();
			
			System.out.printf("effect of passing reference to array elemrnt\n "+
			"array[3] befor modifying is :%d",array[3]);
			
			modifyelement(array[3]);
			System.out.printf(" the value of the array after modify%d",array[3]);
			
			
	}
	
		public static  void   modifyarray(int array1[])
		
		{
			for( int i=0;i<array1.length;i++)
				
			{
				array1[i]*=2;
			}
		}
		public static void modifyelement(int element)
		{
			
			element*=2;
			System.out.printf("Value of element in modifyElement: %d\n",element);
		}
	
	
}
