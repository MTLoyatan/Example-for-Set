import java.util.*;
public class threeangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	number;
	Scanner three =new Scanner(System.in);
	System.out.print(" enter a number:");
		number = three.nextInt();
		
		
	for ( int i=1,s=(number/2); i<=number; i+=2,s--)
	{ for(int k=1;k<=s;k++)
		System.out.print(" ");
		for (int j=0; j<i; j++)
			{System.out.print("*");}
		System.out.println("");
	}
	
	}

}
