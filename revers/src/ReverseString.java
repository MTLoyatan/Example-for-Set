
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
		
		String newString = "mehditaheri";
		String reverse1 = new StringBuffer(newString).reverse().toString();
		System.out.println(reverse1);
		
		String muString ="matthiwo taheri";
		String reverse2 = new StringBuffer(muString).reverse().toString();
		System.out.println(reverse2);
		
		int  len = muString.length();
		for(int i=(len-1);i>=0;i--)
			System.out.print(muString.charAt(i));
			
	}

}
