
public class UsingArray {
		
	private int arr[] = {1,2,3,4,5};
	
	public void function(int[] arr1 ){
		
		for(int i=0; i<arr1.length;i++)
			
			arr1[i]*=2;
		
	}
	
	public void printAray( int[] arr2){
		
		for(int i: arr2)
			System.out.print(" "+ i);
		System.out.println();
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public double  average(int... values){
		
		int total=0;
		
		for(int i: values)
			total+=i;
		return (double)total/values.length;
		
	}
	
	
}
