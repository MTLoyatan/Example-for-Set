
public class Usinarrayproblems {
			
	private int[] arr={1,2,8,5,4,6,9};
	
	
	
	public int[] getArr() {
		return arr;
	}

	public int[]  multipleBy2( int[] arr){
		
		for(int i=0;i<arr.length;i++)
			
			arr[i]*=2;
		
		return arr;
		
		
	}
	
	public void PrintArray(int[]arr){
		
		
		for(int i: arr)
			System.out.print(" "+i);
	}
	
	
	public double average(int...values){
		
		double total=0;
		for(int i: values)
			total+=i;
		
		return total/values.length;
	}
	
	
	
}
