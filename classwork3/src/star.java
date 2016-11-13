import java.util.*;
public class star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int number;
		Scanner starproject = new Scanner(System.in);
 System.out.print("enter a number:");
 number = starproject.nextInt();
 for ( int j = 1 ;j<=number; j++){
 for (int i=1 ; i<=number ; i++)
 {
 if (  i==number)
	 System.out.println("*");
else 
	 System.out.print("*");
 
 }
 
 }
 
	}

}
