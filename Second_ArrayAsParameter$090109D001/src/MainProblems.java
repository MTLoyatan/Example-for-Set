import java.io.ObjectInputStream.GetField;
import java.util.Arrays;


public class MainProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Usinarrayproblems arrys = new Usinarrayproblems();
		
		
		System.out.println(arrys.average(arrys.getArr()));
		Arrays.sort(arrys.getArr());
		arrys.PrintArray(arrys.getArr());
		System.out.println();
		
		
		
	}

}
