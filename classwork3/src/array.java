import java.util.*;
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] myarray={10,8,5,5,4,1};

 for ( int j =0 ; j<myarray.length; myarray[j]*=myarray[j],j++);
 
 for ( int i=0; i<=5;i++)
	 System.out.print(" "+i+ ":" + myarray[i]);
	}

}
