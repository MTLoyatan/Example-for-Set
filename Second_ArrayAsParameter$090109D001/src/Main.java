import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		UsingArray usingarray = new UsingArray();
//		
//		usingarray.printAray(usingarray.getArr());
//		usingarray.function(usingarray.getArr());
//		usingarray.printAray(usingarray.getArr());
//		
//		
//		System.out.println(" "+usingarray.average(10));
//		System.out.println(" "+usingarray.average(10,15,78));
//		if(args.length!=1)
//			System.err.println("error");
//		else {
//		
//		for(int i =1;i<=Integer.parseInt(args[0]);i++)
//			System.out.print(" "+i);}
		
		int arr1[]= {1,2,3,6,4};
		int arr2[]= new int[5];
		int arr3[]= new int[10];
		int arr4[] = {5,5,5,5,5,5,5,5,5,5};
		Arrays.fill(arr3, 5);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		boolean check = Arrays.equals(arr3, arr4);
		System.out.printf("arr3 %s arr4\n",
				(check?"==":"!="));
		check = Arrays.equals(arr1, arr2);
		System.out.printf("arr1 %s arr2\n",
				(check?"==":"!="));
		
		int index = Arrays.binarySearch(arr1, 5);
		if(index>0)
			System.out.println("Yes, exists at "+index);
		else
			System.out.println("No, dosnt exists.");
		index = Arrays.binarySearch(arr1, 3);
		if(index>0)
			System.out.println("Yes, exists at "+index);
		else
			System.out.println("No, dosnt exists.");
		
	}

}
