
import java.util.Random;


public class SortArray {
		
	private int[] data;
	
	
	
	
	public void sort(int []data){
		
		int smallest;
		for(int i=0;i<data.length;i++){
			smallest=i;
			for(int index=i+1;index<data.length;index++)
				
				if(data[index]<data[smallest])
					smallest=index;
					
				int	temp=data[i];
					data[i]=data[smallest];
					data[smallest]=temp;
				}
			
				
		}
		
		
	
	public void toString(int []data){
		
		
		for(int i:data)
			System.out.printf(" %d",i);
			}
}
