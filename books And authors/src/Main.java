import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		DataBase db = new DataBase();
		
		List<Object > lst = new ArrayList<Object>();
		
		try {
			ResultSet rs= db.displayBookswithAuthors();
			while(rs.next()){
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
