import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Vector;


public class VectorTest {

	private static final String[] colors={"red","white","blue"};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<String>();
			
		ArrayList<String> listtest = new ArrayList<String>();
		
		printvector(vector);
					
		for(String color : colors)
			vector.add(color);
		
		System.out.println(" vector after addition");
		printvector(vector);
		System.out.println("\n");
		System.out.println("vectors first and last element ");
		try{
			System.out.println("\n "+vector.firstElement());
			System.out.println("\n "+vector.lastElement());
		}catch(NoSuchElementException  e){
			
			System.out.println(" "+e.getMessage());
		}
		
		if(vector.contains("green"))
			System.out.println("\nred is in index of "+vector.indexOf("red"));
		else 
			System.out.println("color not found");
		
		
		if(vector.remove("green"))
		
		System.out.println(" after remove");
		else
			System.out.println(" color not found");
		printvector(vector);
		System.out.println("");
		System.out.println(" vectors size is: "+vector.size()+"\n vectors capacity is: "+vector.capacity());
	}
			
			

	public static void printvector(Vector<String> vectorToOut){
		
		if(vectorToOut.isEmpty())
			System.out.println("vector is empty");
		else 
			for( String color : vectorToOut)
				System.out.print(" "+color);
	}
}
